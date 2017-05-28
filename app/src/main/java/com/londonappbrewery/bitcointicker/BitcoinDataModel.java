package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ruben on 5/27/17.
 */

public class BitcoinDataModel {

    private String mPrice;

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getPrice() {
        return mPrice;
    }

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {
        BitcoinDataModel bitcoinData = new BitcoinDataModel();

        try {
            bitcoinData.mPrice = jsonObject.getString("last");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return bitcoinData;
    }

}
