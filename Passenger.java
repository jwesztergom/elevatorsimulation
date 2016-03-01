
/**
 *Models a single passenger, creates a passenger and defines their starting location and 
 *their destination. 50% of new passengers will start on the first floor..
 * 
 * @Zach CS216
 * @2/16/2015
 */
public class Passenger
{
    private int start; //Starting floor
    private int destination; //ending floor
    private int startTick; //keep track of time, in ticks?
    private int entryTick;
    private int exitTick;
    private Controller controller;
    

    /**
     * Creates a new passenger with a starting location and a destination, also sets the
     * time to 0.
     */
    public Passenger(int start, int destination)
    {
        this.start = start;
        this.destination = destination;
        startTick = controller.getTick(); //may be changed depending on the way the tick is calculated
    }
    
    /**
     * Returns the starting location of a passenger.
     */
    public int getStart()
    {
        return start;
    }
    
    /**
     * Returns the destination of the passenger.
     */
    public int getDestination()
    {
        return destination;
    }
    
    /**
     * Returns the start tick of the passenger from when the passenger is created.
     */
    public int getStartTick()
    {
        return startTick;
    }
    
    /**
     * Returns the entry tick of the passenger from when the passenger enters the eCar.
     */
    public int getEntryTick()
    {
        return entryTick;
    }
    
    /**
     * Returns the exit tick of the passenger from when the passenger exits the eCar.
     */
    public int getExitTick()
    {
        return exitTick;
    }
  
  
     public String toString()
    {
         return "A passenger is at floor "+ start + " and wishes to travel to floor "
       + destination;
    }
  
}
