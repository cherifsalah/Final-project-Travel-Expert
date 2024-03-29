package data.dummy;
/**
 * Class to provide dummy data (for testing GUI)
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class AgencyData implements data.AgencyData {

    @Override
    public String getAgency(int agentId) {

        return "{\"AgencyId\":1,\"AgncyAddress\":\"1155 8th Ave SW\",\"AgncyCity\":\"Calgary\",\"AgncyProv\":\"AB\",\"AgncyPostal\":\"T2P1N3\",\"AgncyCountry\":\"Canada\",\"AgncyPhone\":\"4032719873\",\"AgncyFax\":\"4032719872\"}";
    }

    @Override
    public String getAllAgencies() {
        return "[{\"AgencyId\":1,\"AgncyAddress\":\"1155 8th Ave SW\",\"AgncyCity\":\"Calgary\",\"AgncyProv\":\"AB\",\"AgncyPostal\":\"T2P1N3\",\"AgncyCountry\":\"Canada\",\"AgncyPhone\":\"4032719873\",\"AgncyFax\":\"4032719872\"},{\"AgencyId\":2,\"AgncyAddress\":\"110 Main Street\",\"AgncyCity\":\"Okotoks\",\"AgncyProv\":\"AB\",\"AgncyPostal\":\"T7R3J5\",\"AgncyCountry\":\"Canada\",\"AgncyPhone\":\"4035632381\",\"AgncyFax\":\"4035632382\"}]";
    }
}