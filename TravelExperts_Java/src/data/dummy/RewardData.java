package data.dummy;

/**
 * Class to provide dummy data (for testing GUI)
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class RewardData implements data.RewardData {
    @Override
    public String getReward(int rewardId) {

        return "{\"RewardId\":1,\"RwdName\":\"Air Miles\"}";
    }

    @Override
    public String getAllRewards() {

        return "[{\"RewardId\":1,\"RwdName\":\"Air Miles\"},{\"RewardId\":2,\"RwdName\":\"AeroPlan\"},{\"RewardId\":3,\"RwdName\":\"AeroPlan Gold\"},{\"RewardId\":4,\"RwdName\":\"Coast Rewards\"},{\"RewardId\":5,\"RwdName\":\"Mariott Rewards\"}]";
    }
}
