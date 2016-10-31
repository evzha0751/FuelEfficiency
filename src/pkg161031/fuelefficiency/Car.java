
package pkg161031.fuelefficiency;

/**
 *Car  class.
 */
public class Car extends Vehicle{
    private double distance;
    
    /**
    * constructor
    * pre: none
    * post: none
    */
    public Car(){
        super();
    }
    
    /**
     * Print out the value of distance by the proportion is given
     * pre: none
     * post: Print the distance
     */
    public void getDistance(){
        distance = 100 * ( 50 / 9.4 );
        System.out.println("Car = "+distance+"KM");
    }
}
