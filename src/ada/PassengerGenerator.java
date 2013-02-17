package ada;

/**
 *
 * @author Krzysztof Kutt & Michal Nowak
 */
public class PassengerGenerator implements Runnable {

    int floorsCount;
    Floors floors;
    
    public PassengerGenerator(int floorsCount, Floors floors) {
        this.floorsCount = floorsCount;
        this.floors = floors;
    }
    
    @Override
    public void run() {
        
        //TODO: wylosuj pietro docelowe i stworz nowego Passengera
        
        //TODO: wylosuj pietro na ktorym on wyladuje (sprawdz czy nie jest takie samo jak docelowe!)
        
        //TODO: dodaj go do odpowiedniej listy floors.addNewPassengerOnFloor()
        
    }
}
