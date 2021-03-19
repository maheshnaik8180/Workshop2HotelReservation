package workshop2;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    public static class HotelReservationServiceTest {

        @Test
        public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {

            HotelReservationService hotelReservationService = new HotelReservationService();

            Hotel hotel = new Hotel("Lakewood", 3, 110, 90);
            hotelReservationService.addHotel(hotel);
            //List<Hotel> hotellist = hotel.getHotels();
            Assert.assertTrue(hotelReservationService.hotelList.contains(hotel));
        }

        @Test
        public void given3Hotels_whenInvokeFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
            HotelReservationService hotelReservationService = new HotelReservationService();
            Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90);
            Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50);
            Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150);
            hotelReservationService.addHotel(Lakewood);
            hotelReservationService.addHotel(Bridgewood);
            hotelReservationService.addHotel(RidgeWood);
            int countDays = hotelReservationService.countDays("2020-09-10", "2020-09-12");
            System.out.println("");
            System.out.println("Total count days : " + countDays);
            Hotel result = hotelReservationService.findCheapestHotel("2020-09-10", "2020-09-12");
            Assert.assertTrue(hotelReservationService.hotelList.contains(result));
        }

        @Test
        public void givenHotel_with3Parameters_whenInvokeAddHotel_shoulBeAbleToAdd() {
            HotelReservationService hotelReservationService = new HotelReservationService();
            Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90);
            Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50);
            Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150);
            hotelReservationService.addHotel(Lakewood);
            hotelReservationService.addHotel(Bridgewood);
            hotelReservationService.addHotel(RidgeWood);
            System.out.println(Lakewood);
            System.out.println(Bridgewood);
            System.out.println(RidgeWood);

        }
    }
}