import java.util.HashMap;
import java.util.Map;
/**
 * A location is identified by name and contains the distance (in time) between other locations.
 */
 public class Location implements Comparable<Location> {
    /**
     * name  is an instance variable, with particular value name to every object of type Location
     */
    private String name;
    /**
     * cost represents a map where we will put <Location, Integer> pairs
     * the Integer object represents the time in which a tourist walks to Location
     */
    private Map<Location, Integer> cost=new HashMap<Location, Integer>();

    /**
     * Constructor with String parameter
     * @param name - represent the name of the location
     */
    public Location(String name) {
        this.name = name;
    }

    /**
     * get the instance variable name value
     * @return a string value of the instance variable name
     */
    public String getName() {
        return name;
    }
    /**
     * set the instance variable name value
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * get the instance variable cost
     * @return  a map with <Location, Integer> pair values representing the time consumed to go from current location to others.
     */
    public Map<Location, Integer> getCost() {
        return cost;
    }

    /**
     * put a new entry in the instance variable cost map
     * @param node - the destination location
     * @param value - time consumed to go between current location to "node"
     */
    public void setCost(Location node, int value) {
        cost.put(node,value);
    }

    /**
     * the method required by Comparable interface used for NATURAL ORDER
     * @param other - the location to compare with
     * @return
     *  - a negative value if the current name is before other's name
     *  - a positive value if the current name is after other's name
     *  - zero if the current name is the same with other's name
     */
     @Override
     public int compareTo(Location other) {
        return this.name.compareTo(other.name);
     }
 }
