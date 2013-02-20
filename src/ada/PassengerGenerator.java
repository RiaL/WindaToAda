package ada;

import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krzysztof Kutt & Michal Nowak
 */
public class PassengerGenerator implements Runnable {

    static int TIME_BETWEEN_PASSENGERS = 7000;
    int floorsCount;
    Floors floors;
    Random r = new Random();

    public PassengerGenerator(int floorsCount, Floors floors) {
        this.floorsCount = floorsCount;
        this.floors = floors;
        this.r = new Random(new Date().getTime());
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); //oczekiwanie na zaladowanie wind

            while (true) {
                try {
                    int to = r.nextInt(Simulation.ILOSC_PIETER);
                    Passenger pass = new Passenger(to);
                    int from = r.nextInt(Simulation.ILOSC_PIETER);
                    while (from == to) {
                        from = r.nextInt(Simulation.ILOSC_PIETER);
                    }

                    //System.out.println("nowy pasazer z: " +from+ " do: " + to );
                    floors.addNewPassengerOnFloor(from, pass);

                    Thread.sleep(TIME_BETWEEN_PASSENGERS);
                } catch (InterruptedException ex) {
                    System.err.println("Problem z sleep()");
                    ex.printStackTrace();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(PassengerGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
