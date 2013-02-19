package Help;

import java.util.List;
import ada.ElevatorEngine;
import ada.Simulation;

/**
 * Tymczasowy zastepnik klasy, ktora bedzie wygenerowana z Ady!
 */
public class Help_Package {
    
    public static int calcNewDestination(boolean requestedFloors[], int currentFloor){
        int minFloor = 0;
        int maxFloor = Simulation.ILOSC_PIETER-1;
        
        for(int i = 0; i < Simulation.ILOSC_PIETER; i++){
            if( requestedFloors[i] == true ) {
                minFloor = i;
                break;
            }
        }
        
        for(int i = Simulation.ILOSC_PIETER-1; i >= 0; i--){
            if( requestedFloors[i] == true ) {
                maxFloor = i;
                break;
            }
        }
        
        //nowe destination to kierunek, w ktorym mamy mniej pieter do pokonania
        if( Math.abs(maxFloor-currentFloor) > Math.abs(minFloor-currentFloor) )
            return minFloor;
        else
            return maxFloor;
    }
    
    
    //wolamy najblizsza winde (mozna zmienic na inna strategie ;) )
    public static int whichElevator(ElevatorEngine elevators[], int destination){
        
        int elevatorNum = 0;
        
        for( int i = 1; i < elevators.length; i++){
            if( Math.abs(elevators[elevatorNum].getCurrentFloor()-destination) >
                    Math.abs(elevators[i].getCurrentFloor()-destination))
                elevatorNum = i;
        }
        
        return elevatorNum;
    }
    
}
