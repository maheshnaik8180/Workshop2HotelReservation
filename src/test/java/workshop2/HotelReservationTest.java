package workshop2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
public class HotelReservationTest {
    static HotelReservationService hotelReservationService;
    @BeforeClass
    public static void initialize() {
        hotelReservationService = new HotelReservationService();
    }
    @Before
    public void shouldPrintWelcomeMessage() {
        hotelReservationService.printWelcomeMessage();
    }

    @Test
    public void givenDate_WeekDayshouldReturn_CheapestHotelNameBridgeWood() throws Exception {
        hotelReservationService.addHotelDetails();
        ArrayList<String> hotelNameList = hotelReservationService.calculateCheapestHotelAndRate("2020-09-14", "2020-09-16");
        Object[] hotelName = hotelNameList.toArray();
        Object[] arrayExpectedOutput = { "RidgeWood" };
        Assert.assertArrayEquals(arrayExpectedOutput, hotelName);
    }

    @Test
    public void givenDateWeekend_shouldReturn_CheapestHotelNameBrideWood() throws Exception {
        hotelReservationService.addHotelDetails();
        ArrayList<String> hotelNameList = hotelReservationService.calculateCheapestHotelAndRate("2020-09-12", "2020-09-13");
        Object[] hotelName = hotelNameList.toArray();
        Object[] arrayExpectedOutput = { "RidgeWood" };
        Assert.assertArrayEquals(arrayExpectedOutput, hotelName);
    }

    @Test
    public void givenDateWeekDayWeekend_shouldReturn_CheapestHotelNameGivesBridgeWood() throws Exception {
        hotelReservationService.addHotelDetails();
        ArrayList<String> hotelNameList = hotelReservationService.calculateCheapestHotelAndRate("2020-09-11", "2020-09-12");
        Object[] hotelName = hotelNameList.toArray();
        Object[] arrayExpectedOutput = { "RidgeWood" };
        Assert.assertArrayEquals(arrayExpectedOutput, hotelName);
    }

}