
package pkg161031.fuelefficiency;

/**
 *HybridCar class.
 */
public class HybridCar extends Vehicle{
    private double distance;
    
    /**
    * constructor
    * pre: none
    * post: none
    */
    public HybridCar(){
        super();
    }
    
    /**
     * Print out the value of distance by the proportion is given
     * pre: none
     * post: Print the distance
     */
    public void getDistance(){
        distance = 100 * ( 50 / 3.8 );
        System.out.println("Car = "+distance+"KM");
    }
}
