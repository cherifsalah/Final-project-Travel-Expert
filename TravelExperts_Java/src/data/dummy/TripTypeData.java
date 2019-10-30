package data.dummy;

/**
 * Class to provide dummy data (for testing GUI)
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class TripTypeData implements data.TripTypeData {
    @Override
    public String getTripType(String Id) {

        return "{\"triptypeId\":\"B\",\"ttName\":\"Business                 \"}";
    }

    @Override
    public String getTripTypes() {

        return "[{\"triptypeId\":\"B\",\"ttName\":\"Business                 \"},{\"triptypeId\":\"G\",\"ttName\":\"Group                    \"},{\"triptypeId\":\"L\",\"ttName\":\"Leisure                  \"}]";
    }
}
