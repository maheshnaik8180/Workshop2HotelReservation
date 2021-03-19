package workshop2;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HotelReservationTest
{
    static HotelReservationService hotelReservationService;
    @BeforeClass
    public static void initialize() {
        hotelReservationService = new HotelReservationService();
    }

    // testing for cheap hotel
    @Test
    public void Test()throws Exception {
        HotelReservationService hotelReservationService = new HotelReservationService();
        hotelReservationService.HotelDetails();
        String cheapHotel = hotelReservationService.CheapestHotel("10Sep2020", "11Sep2020");
        Assert.assertEquals("Lakewood", cheapHotel);
    }
}