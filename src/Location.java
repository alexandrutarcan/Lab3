import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public abstract class Location implements Comparable<Location>
{
    protected String name;

    protected Map<Location, Integer> cost = new HashMap<>();

    public void setCost(Location node, int value) {
        cost.put(node, value);
    }

    @Override
    public int compareTo(Location other) {
        if (other.name == null)
            return -1;
        return this.name.compareTo(other.name);

    }
}