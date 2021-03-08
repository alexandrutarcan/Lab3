import java.time.LocalTime;

/**
 * A church is a location that can be visitable in a specific interval.
 */
public class Church extends Location implements Visitable{

    /**
     * openingTime and closingTime are instance variables, with particular value to every object that can be visitable
     * openingTime represents the  opening time of the location
     * closingTime  represents the  closing time of the location
     */
    private LocalTime openingTime, closingTime;

    /**
     * Constructor which call the constructor with String parameter from Location superclass
     * @param name - represent the name of the church
     */
    public Church(String name){
        super(name);
    }

    /**
     * the implementation of the abstract getOpeningTime() from Visitable interface
     * @return the opening time location in LocalTime format
     */
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    /**
     * the implementation of the abstract getClosingTime() from Visitable interface
     * @return the closing time location in LocalTime format
     */
    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    /**
     * set the value of the openingTime instance variable
     * @param openingTime  represents the  opening time of the church
     */
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * set the value of the closingTime instance variable
     * @param closingTime represents the  closing time of the church
     */
    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    /**
     * override toString() method from Object class
     * @return the identity of the object in a formatted string value, including opening and closing time values
     */
    @Override
    public String toString() {
        return "Church " + getName()+
                " {openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                '}';
    }
}
