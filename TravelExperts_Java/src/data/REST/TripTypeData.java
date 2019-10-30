package data.REST;

import rest.API;
/**
 * Class to provide specific locations to the REST API
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class TripTypeData implements data.TripTypeData {
    @Override
    public String getTripType(String tripTypeId) {

        // Call the API
        return API.getJson(Constants.URL + "/triptype/gettriptype/" + tripTypeId);    }

    @Override
    public String getTripTypes() {

        // Call the API
        return API.getJson(Constants.URL + "/triptype/getalltriptypes");    }
}
