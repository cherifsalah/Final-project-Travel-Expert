package data.REST;

import rest.API;
/**
 * Class to provide specific locations to the REST API
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class AgentData implements data.AgentData {

    @Override
    public String getAgent(int agentId) {

        // Call the API
        return API.getJson(Constants.URL + "/agent/getagent/" + agentId);
    }

    @Override
    public String getAllAgents() {

        // Call the API
        return API.getJson(Constants.URL + "/agent/getallagents");
    }

    @Override
    public String insertAgent(String jsonData) {

        // Send data to the API and return message
        return API.putJson(Constants.URL + "/agent/insertagent", jsonData);
    }

    @Override
    public String updateAgent(String jsonData) {

        // Send data to the API and return message
        return API.postJson(Constants.URL + "/agent/updateagent", jsonData);
    }

    @Override
    public String deleteAgent(int agentId) {

        // Send data to the API and return message
        return API.deleteJson(Constants.URL + "/agent/deleteagent/" + agentId);
    }
}
