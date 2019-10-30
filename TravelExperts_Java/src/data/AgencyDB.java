package data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Agency;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/**
 * Class to delegate access to either REST API or dummy data (for testing)
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class AgencyDB {

    private Gson gson;
    private AgencyData agencyData;

    // Constructor
    public AgencyDB(AgencyData agencyData) {
        this.agencyData = agencyData;
    }

    /**
     * Retrieve Agency Json and return Agency object
     * @param agencyId - id of the Agency
     * @return Agency object
     */
    public Agency getAgency(int agencyId) {

        gson = new Gson();
        String jsonData = this.agencyData.getAgency(agencyId);
        System.out.println("jsonData: " + jsonData);
        return gson.fromJson(jsonData, Agency.class);
    }

    /**
     * Retrieve AgencyList json and return ArrayList<Agency> object
     * @return list of all agencies in database
     */
    public ArrayList<Agency> getAgencyList() {

        gson = new Gson();
        String jsonData = this.agencyData.getAllAgencies();
        System.out.println("jsonData: " + jsonData);

        // Turn jsondata into list of objects
        Type type = new TypeToken<List<Agency>>() {}.getType();
        return gson.fromJson(jsonData, type);
    }
}
