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
}
