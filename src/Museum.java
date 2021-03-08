import java.time.LocalTime;

public class Museum extends Location implements Payable, Visitable {
    /**
     * ticketPrice represents the  price of the ticket to have access to the museum
     */
    private double ticketPrice;
    /**
     * openingTime and closingTime are instance variables, with particular value to every object that can be visitable
     *openingTime represents the opening time location using a LocalTime format
     *closingTime represents the closing time location using a LocalTime format
     */
    private LocalTime openingTime, closingTime;
    /**
     * Constructor which call the constructor with String parameter from Location superclass
     * @param name - represent the name of the museum
     */
    public Museum(String name){
        super(name);
    }
    @Override
    public double getTicketPrice() {
        return ticketPrice;
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
     * set the value of the ticketPrice instance variable
     * @param ticketPrice  represents the  price of the ticket to have access to the museum
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    /**
     * set the value of the openingTime instance variable
     * @param openingTime  represents the  opening time of the museum
     */
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }
    /**
     * set the value of the openingTime instance variable
     * @param closingTime  represents the  closing time of the museum
     */
    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    /**
     * override toString() method from Object class
     * @return the identity of the object in a formatted string value, including opening, closing time and ticket price value
     */
    @Override
    public String toString() {
        return "Museum " + getName()+
                " {ticketPrice=" + ticketPrice +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                '}';
    }
}
