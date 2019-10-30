package data.REST;

import rest.API;
/**
 * Class to provide specific locations to the REST API
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class RewardData implements data.RewardData {
    @Override
    public String getReward(int rewardId) {

        // Call the API
        return API.getJson(Constants.URL + "/reward/getreward/" + rewardId);
    }

    @Override
    public String getAllRewards() {

        // Call the API
        return API.getJson(Constants.URL + "/reward/getallrewards");
    }
}
