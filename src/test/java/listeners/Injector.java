package listeners;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;


public class Injector implements IAlterSuiteListener {
    @Override
    public void alter(List<XmlSuite> suites) {


        XmlSuite suite = suites.get(0);
        Properties properties = new Properties(System.getProperties());
        try {
            //properties.load(new FileReader("src/test/resources/tests01.properties"));
            properties.load(new FileReader("src/test/resources/tests.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Map<String, String> params = new HashMap<>();
        for (Map.Entry<Object, Object> each : properties.entrySet()) {
            params.put(each.getKey().toString(), each.getValue().toString());

        }
        suite.setParameters(params);
    }
}
