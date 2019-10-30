package data.REST;

import rest.API;
/**
 * Class to provide specific locations to the REST API
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class AgencyData implements data.AgencyData {

    @Override
    public String getAgency(int agencyId) {

        // Call the API
        return API.getJson(Constants.URL + "/agency/getagency/" + agencyId);
    }

    @Override
    public String getAllAgencies() {

        // Call the API
        return API.getJson(Constants.URL + "/agency/getallagencies/");
    }
}
