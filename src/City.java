import java.util.ArrayList;
import java.util.List;
/**
 * In a city there are various locations.
 */
public class City {
    /**
     * instance variable used to store in a sequence the locations of the city
     */
   private List<Location> nodes=new ArrayList<>();

    /**
     * Constructor without parameter
     */
    public City() {
    }

    /**
     * Constructor with a parameter
     * @param nodes represents a sequence with the locations of the city
     */
    public City(List<Location> nodes) {
        this.nodes = nodes;
    }

    /**
     * get the collection with the locations
     * @return a sequence with the locations of the city
     */
    public List<Location> getNodes() {
        return nodes;
    }
    /**
     * set the collection with the locations
     */
    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }

    /**
     * add a location to the list of nodes
     * @param node - a Location instance
     */
    public void addLocation(Location node){
        nodes.add(node);
    }
    /**
     * override toString() method from Object class
     * @return a city in a formatted string value, including nodes
     */
    @Override
    public String toString() {
        return "City{" +
                "nodes=" + nodes +
                '}';
    }
}
