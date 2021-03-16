package workshop2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class HotelReservationTest {
    @Test
    public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {

        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservationService.addHotel(hotel);
        List<Hotel> hotelList = hotelReservationService.getHotels();
        Assert.assertTrue(hotelList.contains(hotel));
    }

    @Test
    public void given3Hotels_whenInvokeFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
   HotelReservationService hotelReservationService = new HotelReservationService();
   Hotel Lakewood = new Hotel("Lakewood",110);
   Hotel Bridgewood = new Hotel("Bridgewood",160);
   Hotel Ridgewood = new Hotel("Ridgewood",220);
   hotelReservationService.addHotel(Lakewood);
   hotelReservationService.addHotel(Bridgewood);
   hotelReservationService.addHotel(Ridgewood);
   int countDays = hotelReservationService.countDays("2020-09-10","2020-09-12");
   System.out.println("Total count days : " +countDays);
   Hotel result = hotelReservationService.findCheapestHotel();
   Assert.assertTrue(hotelReservationService.hotelList.contains(result));

    }
}
