package ada;

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
            //TODO: jezeli winda stala to trzeba ja jakos ruszyc, Ada decyduje (wybiera destination)
        }
    }
    
    private void removeRequestFloor(int floor){
        changeRequestFloor(floor, false);
    }
    
    private synchronized void changeRequestFloor(int floor, boolean newState){
        this.requestedFloors[floor] = newState;
    }
    
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        
        elevator.setStartParams(number,this);
        
        while(true){
            try {
                
                //TODO: zmieniamy pietro (currentFloor + state; pamietaj o sprawdzeniu czy nie wychodzisz poza zakres)
                //      jezeli pietro zostalo zmienione to statFloors++;
                
                //TODO: czy na tym pietrze sie zatrzymujemy? jezeli nie to koniec tego obiegu petli
                
                //TODO: otwarcie drzwi
                
                //TODO: kto wysiada
                
                Thread.sleep(TIME_ON_FLOOR);   //wymiana pasazerow
                
                //TODO: kto wsiada getPassengersFromFloor(floor, maxymalna liczba osob ktore sie zmieszcza)
                //      zwieksz odpowiednio statPassengers;
                
                //TODO: zamkniecie drzwi
                
                //TODO: usuwamy zadanie zatrzymania na tym pietrze: removeRequestFloor()
                //TODO: wygaszamy przycisk zatrzymania na tym pietrze (Floor)
                
                //TODO: jezeli winda jest pusta i nie ma wezwan to jedz na gore/dol albo po prostu czekaj w tym miejscu
                
                //TODO: jezeli nie osiagnieto destination to ciagle jedz w tym kierunku (czyli nic nie robisz,
                //      w nastepnym obiegu petli winda bedzie pietro wyzej/nizej)
                
                //TODO: jezeli osiagnieto destination - niech Ada ustali co robic (nowe destination)
                
                Thread.sleep(TIME_FOR_MOVE);  //jedziemy na kolejne pietro
                
            } catch (InterruptedException ex) {
                System.err.println("Problem z sleep()");
                ex.printStackTrace();
            }
        }
    }
    
}
