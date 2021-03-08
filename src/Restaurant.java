public class Restaurant extends Location implements Classifiable {
    /**
     * rank - represents the  number of stars of the restaurant using a int value
     */
    private int rank;
    /**
     * Constructor which call the constructor with String parameter from Location superclass
     * @param name - represent the name of the restaurant
     */
    public Restaurant(String name){
        super(name);
    }
    /**
     * the implementation of the abstract getRank() from Classifiable interface
     * @return rank  represents the  number of stars of the restaurant
     */
    @Override
    public int getRank() {
        return rank;
    }
    /**
     * set the value of the rank instance variable
     * @param rank  represents the  number of stars of the restaurant
     */
    public void setRank(int rank) {
        this.rank = rank;
    }
    /**
     * override toString() method from Object class
     * @return the identity of the object in a formatted string value, including ticket price and rank values
     */

    @Override
    public String toString() {
        return "Restaurant " + getName()+
                " {rank=" + rank +
                '}';
    }
}
