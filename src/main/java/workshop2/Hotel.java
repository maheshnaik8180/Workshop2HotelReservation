package workshop2;

import java.time.LocalDate;
import java.util.List;

public class Hotel {

    private String name;
    private int rate;
    private int weekdayrate;
    private int weekendrate;



    @Override
    public String toString() {
        return "Hotel [name=" + name + ", rate=" + rate + ", weekdayrate=" + weekdayrate + ", weekendrate="
                + weekendrate + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekdayrate() {
        return weekdayrate;
    }

    public void setWeekdayrate(int weekdayrate) {
        this.weekdayrate = weekdayrate;
    }

    public int getWeekendrate() {
        return weekendrate;
    }

    public void setWeekendrate(int weekendrate) {
        this.weekendrate = weekendrate;
    }

    public Hotel(String name, int rate, int weekdayrate, int weekendrate) {
        super();
        this.name = name;
        this.rate = rate;
        this.weekdayrate = weekdayrate;
        this.weekendrate = weekendrate;
    }

    public int getRate() {
        return rate;
    }
    public int estimateRate(String date1, String date2){
        LocalDate startdate = LocalDate.parse(date1);
        LocalDate enddate = LocalDate.parse(date2);
        int calculatedRate = 0;
        for(LocalDate currentDate = startdate; (currentDate.isBefore(enddate) || currentDate.equals(enddate)); currentDate = currentDate.plusDays(1)){
            calculatedRate += weekdayrate;



        }
        return calculatedRate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public List<Hotel> getHotels() {
        List<Hotel> hotel = null;
        return hotel;
    }
}