/**
 * A hotel is a location that can be classifiable in stars.
 */
public class Hotel extends Location implements Classifiable{
    /**
     * rank - represents the  number of stars of the hotel using a int value
     */
    private int rank;

    /**
     * Constructor which call the constructor with String parameter from Location superclass
     * @param name - represent the name of the hotel
     */
    public Hotel(String name){
        super(name);
    }
    /**
     * the implementation of the abstract getRank() method from Classifiable interface
     * @return rank  represents the  number of stars of the restaurant
     */
    @Override
    public int getRank() {
        return rank;
    }

    /**
     * set the value of the rank instance variable
     * @param rank  represents the  number of stars of the hotel
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * override toString() method from Object class
     * @return the identity of the object in a formatted string value, including rank value
     */
    @Override
    public String toString() {
        return "Hotel " + getName()+
                " {rank=" + rank +
                '}';
    }
}
