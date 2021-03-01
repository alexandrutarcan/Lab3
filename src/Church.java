import java.time.LocalTime;

public class Church extends Location implements Visitable{

    protected LocalTime openingTime;
    protected LocalTime closingTime;
    public void setOpeningTime(LocalTime openingTime){

    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public LocalTime getOpeningTime(){
        return openingTime;
    }
    public LocalTime getClosingTime(){
        return closingTime;
    }

}
