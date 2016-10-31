

package pkg161031.fuelefficiency;

import java.util.Scanner;


public class FuelEfficiency {

    public static void main(String[] args) {
    
    Vehicle theArray[] = new Vehicle[5]; 
    double value = 50;

        System.out.println("On 50.0L of gas the vehicles can drive");
        System.out.println(" ");

        for(int i=0;i<5;i++){
            if(i==1){
                theArray[1]=new Car();
                theArray[1].getDistance();
            }else if(i==2){
                theArray[2]=new Truck();
                theArray[2].getDistance();
            }else if(i==3){
                theArray[3]=new HybridCar();
                theArray[3].getDistance();
            }else if(i==4){
                theArray[4]=new Motorcycle();
                theArray[4].getDistance();
            }
        }
        


    }
    
}
