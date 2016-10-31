
package pkg161031.fuelefficiency;

/**
 * Motorcycle class.
 */
public class Motorcycle extends Vehicle{
    private double distance;
    
    /**
    * constructor
    * pre: none
    * post: none
    */
    public Motorcycle(){
        super();
    }
    
    /**
     * Print out the value of distance by the proportion is given
     * pre: none
     * post: Print the distance
     */
    public void getDistance(){
        distance = 100 * ( 50 / 6.3 );
        System.out.println("Car = "+distance+"KM");
    }
}
