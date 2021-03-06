package io.codelex.currencyConverter;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Map;

public class CurrencyConvertor {

    public static void main(String[] args) throws IOException {
        String exchangeRateRawDta = getExcahngeRates();

        JSONObject exchangeRateObject = new JSONObject(exchangeRateRawDta);
        JSONObject rates = (JSONObject) exchangeRateObject.get("rates");
        Map<String, Object> rateValues = rates.toMap();

        CurrencyRate[] allRates = new CurrencyRate[rateValues.size()];

        int i=0;
        for (Map.Entry<String, Object> valuePair: rateValues.entrySet() ) {
            allRates[i] = new CurrencyRate(valuePair.getKey(), new BigDecimal (valuePair.getValue().toString()));
            i++;
        }

        System.out.println(exchangeRateRawDta);


    }
    public static String getExcahngeRates() throws IOException {
        String theURL ="https://api.exchangerate.host/latest";
        URL url = new URL(theURL);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        StringBuilder inputData = new StringBuilder();
        String inputLine;

        while((inputLine = in.readLine()) != null) {
            inputData.append(inputLine);
        }


        return inputData.toString();
    }
}
