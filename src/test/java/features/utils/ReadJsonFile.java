package features.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class ReadJsonFile {
    private static Map<String, String> map = new HashMap<>();
    private static final JSONParser jsonParser = new JSONParser();
    private static final String jsonPath = System.getProperty("user.dir")+
            "/src/test/resources/data/staticData.json";

    public ReadJsonFile() {
    }

    public static String getReadJsonByPath(String[] strings) {
        String value = null;
        try (FileReader reader = new FileReader(jsonPath)) {
            Object obj = jsonParser.parse(reader);
            JSONObject json = (JSONObject) obj;
            for (int i = 0; i < strings.length - 1; i++) {
                json = (JSONObject) json.get(strings[i]);
            }
            value = json.get(strings[strings.length - 1]).toString();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return value;
    }

  public static void main(String[] args) {
        System.out.println(ReadJsonFile.getReadJsonByPath(new String[]{"credential","user"}));
    //
  }
}

