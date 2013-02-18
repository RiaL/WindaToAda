package ada;

import java.util.Random;

/**
 *
 * @author Krzysztof Kutt & Michal Nowak
 */
public class PassengerGenerator implements Runnable {

    int floorsCount;
    Floors floors;
    Random r = new Random();
    public PassengerGenerator(int floorsCount, Floors floors) {
        this.floorsCount = floorsCount;
        this.floors = floors;
    }
    
    @Override
    public void run() {
        
        int to = r.nextInt(Simulation.ILOSC_PIETER);
        Passenger pass = new Passenger(to);
        int from = r.nextInt(Simulation.ILOSC_PIETER);
        while(from == to){
            from = r.nextInt(Simulation.ILOSC_PIETER);
        }
        //System.out.println("nowy pasazer z: " +from+ " do: " + to );
        
        floors.addNewPassengerOnFloor(from, pass);
        //TODO: wylosuj pietro docelowe i stworz nowego Passengera
        // DONE
        
        //TODO: wylosuj pietro na ktorym on wyladuje (sprawdz czy nie jest takie samo jak docelowe!)
        // DONE
        
        //TODO: dodaj go do odpowiedniej listy floors.addNewPassengerOnFloor()
        // DONE
    }
}
