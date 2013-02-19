package ada;

import java.util.Iterator;

/**
 *
 * @author Krzysztof Kutt & Michal Nowak
 */
public class ElevatorEngine implements Runnable {

    /** czas przejazdu pomiedzy pietrami */
    static int TIME_FOR_MOVE = 1000;
    /** czas wymiany pasazerow na pietrze */
    static int TIME_ON_FLOOR = 1000;
    
    int number;
    int capacity;
    /** stan windy: -1 w dol, 0 stoi, +1 w gore */
    int state;
    boolean doorOpen;
    int currentFloor;
    int destination;
    
    /** pasazerowie w windzie */
    PassengerList passengers;
    
    /** przyciski wcisniete w windzie */
    boolean buttons[];
    
    /** winda ma sie zatrzymac na tych pietrach */
    boolean requestedFloors[];
    
    Floors floors;
    Elevator elevator;
    
    /** statistics */
    int statPassengers;
    int statFloors;
    
    public ElevatorEngine(int number, int capacity, int currentFloor, Floors floors, Elevator elevator) {
        this.number = number;
        this.capacity = capacity;
        this.currentFloor = currentFloor;
        this.destination = currentFloor;
        this.buttons = new boolean[floors.getFloorsCount()];
        this.requestedFloors = new boolean[floors.getFloorsCount()];
        this.floors = floors;
        this.elevator = elevator;
        
        state = 0;
        passengers = new PassengerList();
        doorOpen = false;
        statPassengers = 0;
    }
    
    void handleElevatorButton(int floor){
        addRequestFloor(floor);
    }
    
    public void addRequestFloor(int floor){
        changeRequestFloor(floor, true);
        
        if(state == 0){
            destination = Help.Help_Package.calcNewDestination(requestedFloors, currentFloor);
            if(destination > currentFloor)
                state = 1;
            else if (destination < currentFloor)
                state = -1;
        }
    }
    
    private void removeRequestFloor(int floor){
        changeRequestFloor(floor, false);
    }
    
    private synchronized void changeRequestFloor(int floor, boolean newState){
        this.requestedFloors[floor] = newState;
    }
    
    private void draw(){
        elevator.setGUI(passengers.size(), doorOpen, currentFloor);
        floors.setGUI();
    }
    
    public int getCurrentFloor(){
        return currentFloor;
    }
    
    public void alarm() {
        //winda jedzie na dol:
        destination = 0;
        if (destination > currentFloor) {
            state = 1;
        } else if (destination < currentFloor) {
            state = -1;
        } else {
            state = 0;
        }
        
        //usuwamy wszystkie wezwania:
        for(int i = 0; i < requestedFloors.length; i++)
            removeRequestFloor(i);
    }
    
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        
        elevator.setStartParams(number,this);
        floors.addElevator(number,this);
        
        while(true){
            try {
                draw();
                
                Thread.sleep(TIME_FOR_MOVE);  //jedziemy na kolejne pietro
                
                //WARN: teoretycznie nie wykroczymy poza zakres, ale moze to sprawdzic?
                currentFloor += state;
                if (state != 0)
                    statFloors++;
                
                //jezeli osiagnelismy destination - wyznacz nowe :)
                if (currentFloor == destination) {
                    destination = Help.Help_Package.calcNewDestination(requestedFloors, currentFloor);
                    if (destination > currentFloor) {
                        state = 1;
                    } else if (destination < currentFloor) {
                        state = -1;
                    } else {
                        state = 0;
                    }
                }
                
                //jezeli nikt nie chcial sie zatrzymac to jedziemy dalej
                if(this.requestedFloors[currentFloor] == false){
                    continue;
                }
                
                doorOpen = true;
                draw();
                
                //wysiadaja zainteresowani
                int howManyWysiada = 0;
                for(Iterator<Passenger> itr = passengers.iterator(); itr.hasNext(); ) {
                    Passenger passenger = itr.next();
                    if( passenger.getDestination() == currentFloor ) {
                        howManyWysiada++;
                        itr.remove();
                    }
                }
                if( howManyWysiada > 0 )
                    System.out.println("[INFO] Winda " + number + ": pietro " + currentFloor + ", wysiada " 
                            + howManyWysiada + " pasazer(ow)");
                
                Thread.sleep(TIME_ON_FLOOR);   //wymiana pasazerow
                
                //wsiadaja nowi pasazerowie
                Passenger newPassengers[] = floors.getPassengersFromFloor(currentFloor, this.capacity - this.passengers.size());
                if( newPassengers != null ){
                    for(int i = 0; i < newPassengers.length; i++){
                        passengers.add(newPassengers[i]);
                        System.out.println("[INFO] Winda " + number + ": nowy pasazer (cel:"
                                + newPassengers[i].getDestination() + ")");
                    }
                    statPassengers += newPassengers.length;
                }
                
                doorOpen = false;
                draw();
                
                //obsluzylismy juz to pietro:
                removeRequestFloor(currentFloor);
                floors.switchDownFloorButton(currentFloor);
                buttons[currentFloor] = false;
                elevator.enableButtonOnFloor(currentFloor);
                
            } catch (InterruptedException ex) {
                System.err.println("Problem z sleep()");
                ex.printStackTrace();
            }
        }
    }
    
}
