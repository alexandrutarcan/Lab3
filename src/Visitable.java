import java.time.LocalTime;

/**
 * used to make an object visitable in an interval
 */
public interface Visitable {
    LocalTime getOpeningTime();
    LocalTime getClosingTime();
}
