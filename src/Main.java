import java.time.LocalTime;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //generate the instance from laboratory example

        //generate a Hotel instance
        Hotel hotelA = new Hotel("A");
        hotelA.setRank(5);

        //generate 2 Museum instances
        Museum museumB = new Museum("B");
        museumB.setOpeningTime(LocalTime.of(9, 30));
        museumB.setClosingTime(LocalTime.parse("17:00"));
        museumB.setTicketPrice(20);

        Museum museumA = new Museum("A");
        museumA.setOpeningTime(LocalTime.of(9, 30));
        museumA.setClosingTime(LocalTime.parse("17:00"));
        museumA.setTicketPrice(20);

        //generate 3 Church instances
        Church churchA = new Church("A");
        churchA.setOpeningTime(LocalTime.of(7, 0));
        churchA.setClosingTime(LocalTime.MIDNIGHT);

        Church churchB = new Church("B");
        churchB.setOpeningTime(LocalTime.of(7, 0));
        churchB.setClosingTime(LocalTime.MIDNIGHT);

        //generate 1 Restaurant instance
        Restaurant restaurantA = new Restaurant("A");
        restaurantA.setRank(3);

        //declaring and instanciated an array of Visitable type objects
        Visitable[] array = {museumA, museumB, churchA, churchB};
        for (Visitable visitable : array) {
            System.out.println(visitable);
        }

        //create an instance of a City
        City city = new City();

        //add some locations to the list
        city.addLocation(hotelA);
        city.addLocation(museumA);
        city.addLocation(museumB);
        city.addLocation(churchA);
        city.addLocation(churchB);
        city.addLocation(restaurantA);
        //city.addLocation(null);

        //examples to use Comparable and Comparator interfaces
        if (!city.getNodes().contains(null)) {
            Collections.sort(city.getNodes());
            System.out.println("city:" + city);

            DescendingNameComparator descendingNameComparator = new DescendingNameComparator();
            Collections.sort(city.getNodes(), descendingNameComparator);
            System.out.println(city.getNodes());
        } else {
            System.out.println("Can't sort because contains null elements!");
        }

        //set the time distance for the used instances
        hotelA.setCost(museumA, 10);
        hotelA.setCost(museumB, 50);

        museumA.setCost(museumB, 20);
        museumA.setCost(churchA, 20);
        museumA.setCost(churchB, 10);

        museumB.setCost(churchA, 20);
        museumB.setCost(museumA, 20);

        churchA.setCost(churchB, 30);
        churchA.setCost(restaurantA, 10);

        churchB.setCost(churchA, 30);
        churchB.setCost(restaurantA, 20);

        System.out.println("Time between locations:");

        System.out.println(hotelA.getCost());
        System.out.println(museumA.getCost());
        System.out.println(museumB.getCost());
        System.out.println(churchA.getCost());
        System.out.println(churchB.getCost());
    }
}
