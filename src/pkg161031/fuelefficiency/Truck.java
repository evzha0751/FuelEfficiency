

package pkg161031.fuelefficiency;


/**
 * Truck class.
 */
public class Truck extends Vehicle{
    private double distance;
    
    /**
    * constructor
    * pre: none
    * post: none
    */
    public Truck(){
        super();
    }
    
    /**
     * Print out the value of distance by the proportion is given
     * pre: none
     * post: Print the distance
     */
    public void getDistance(){
        distance = 100 * ( 50 / 14.1 );
        System.out.println("Truck = "+distance+"KM");
    }
}
