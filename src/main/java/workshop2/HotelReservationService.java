package workshop2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class HotelReservationService {


    List<Hotel> hotelList = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }
    public List<Hotel> getHotels() {
        return hotelList;
    }

    public int countDays(String firstDate,String lastDate) {
        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(lastDate);
        return  (int) ChronoUnit.DAYS.between(startDate,endDate);
    }

    public Hotel findCheapestHotel(String date1, String date2) {

        Hotel cheapestRate  =  hotelList.stream().min((a, b) -> a.estimateRate(date1, date2) - b.estimateRate(date1, date2)).orElseThrow(NoSuchElementException::new);
        System.out.println(cheapestRate);
        return cheapestRate;

    }
}