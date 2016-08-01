package com.tsp.sgfens.ws.sepomex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class ConsultaDatosSepomex {

    public String informationByCP(String CP){
        StringBuilder sb = new StringBuilder();
        try {
                
		URL url = new URL("https://sepomex-api.herokuapp.com/api/v1/zip_codes?zip_code="+CP);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
	        (conn.getInputStream())));
                String line="";
                while ((line = br.readLine()) != null) {
		  sb.append(line);
	        }
		conn.disconnect();

	  } catch (MalformedURLException e) {
		e.printStackTrace();
                return "{error:true,message:"+e.getMessage()+"}";

	  } catch (IOException e) {
		e.printStackTrace();
                return "{error:true,message:"+e.getMessage()+"}";

          }
   
        return sb.toString();
    }
}
