package data.REST;

import rest.API;
/**
 * Class to provide specific locations to the REST API
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class Customer_rewardsData implements data.Customer_rewardsData {
    @Override
    public String getCustomer_rewards(int customer_rewardsId) {

        // Call the API
        return API.getJson(Constants.URL + "/customer_rewards/getcustomer_rewards/" + customer_rewardsId);    }

    @Override
    public String getAllCustomer_rewards() {

        // Call the API
        return API.getJson(Constants.URL + "/customer_rewards/getallcustomer_rewards");    }
}
