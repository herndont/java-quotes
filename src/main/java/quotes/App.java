/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        //quotes from API
        String apiURL = "https://ron-swanson-quotes.herokuapp.com/v2/quotes";

        String jsonFromAPI = getRonJsonFromAPI(apiURL);

        if (jsonFromAPI == null) {
            //quotes from file
            Quote showQuote = getJsonFromFile();
            System.out.println(showQuote);
        } else {
            //TODO this is where we need to call the printRonToFile method once we figure out how to write the method
            System.out.println(jsonFromAPI);
        }

    }


    public static String getRonJsonFromAPI(String ronurl) {
        try {
            URL url = new URL(ronurl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int status = connection.getResponseCode();

            if (status == 200) {
                try (BufferedReader reader = useConnectedBufferedReader(connection)) {
                    String contents = "";
                    String currentLine = reader.readLine();
                    while (currentLine != null) {
                        contents = contents + currentLine;
                        currentLine = reader.readLine();
                    }
                    connection.disconnect();
                    return ("Ron Swanson once said: " + contents);
                } catch (IOException e) {
                    System.out.println("something went wrong");
                }
            } else {
                System.out.println("Current status:" + status);
            }
        } catch (Exception e) {
            System.out.println("Ron Swanson Connection Failed. Too bad, so sad.");
        }
        return null;
    }

    //buffered reader connection
    public static BufferedReader useConnectedBufferedReader(HttpURLConnection connection) throws IOException {
        InputStream inputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        return reader;
    }

    public static String getBufferedReaderData(BufferedReader reader) throws IOException {
        StringBuilder builder = new StringBuilder();
        String currentLine = reader.readLine();
        while (currentLine != null) {
            builder.append(currentLine);
            currentLine = reader.readLine();
        }
        return builder.toString();
    }

    //quotes from json file
    public static Quote getJsonFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("quotes.json"));
            Gson gson = new Gson();
            Quote[] resultingQuote = gson.fromJson(reader, Quote[].class);

            Random rand = new Random();
            int num = rand.nextInt(resultingQuote.length);
            return resultingQuote[num];

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void printRonToFile(String e) {
        Gson gson = new Gson();
        String json =gson.toJson(e);
    }

}