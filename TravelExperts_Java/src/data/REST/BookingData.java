package data.REST;

import rest.API;
/**
 * Class to provide specific locations to the REST API
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class BookingData implements data.BookingData {

    @Override
    public String getBooking(int bookingId) {

        // Call the API
        return API.getJson(Constants.URL + "/booking/getbooking/" + bookingId);
    }

    @Override
    public String getAllBookings() {

        // Call the API
        return API.getJson(Constants.URL + "/booking/getallbookings");
    }
}
