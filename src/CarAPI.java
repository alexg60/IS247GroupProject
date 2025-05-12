import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * This class connects to the Cars API and pulls information about the car
 */
public class CarAPI {
    private static final String API_KEY = "DgjFu6OnACWIHhS0uoOvEw==MhcFW1JNkDuVWB70";
    private static final String BASE_URL = "https://api.api-ninjas.com/v1/cars";

    public String getCarInfo(String make, String model) {
        String response = "";
        try {
            String query = String.format("make=%s&model=%s",
                    URLEncoder.encode(make, "UTF-8"),
                    URLEncoder.encode(model, "UTF-8"));
            URL url = new URL(BASE_URL + "?" + query);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("X-Api-Key", API_KEY);

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder result = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();
            response = result.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
