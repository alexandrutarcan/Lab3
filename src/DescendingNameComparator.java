import java.util.Comparator;

/**
 * Define a comparator by descending natural order of locations' names
 */
public class DescendingNameComparator implements Comparator<Location> {
    /**
     * ovverrides the method from Comparator interface
     * @param o1 - the location to be compared
     * @param o2 - the location compared with
     * @return
     *  - a negative value if the o1 name is before o2 name
     *  - a positive value if the o1 name is after o2 name
     *  - zero if the o1 name is the same with o2 name
     */
    @Override
    public int compare(Location o1, Location o2) {
        return o2.compareTo(o1);
    }
}
