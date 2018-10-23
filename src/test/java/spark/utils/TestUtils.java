package spark.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by pchien on 10/5/15.
 */

public class TestUtils {

        public static Properties readUserConfigs(InputStream input) {
        Properties prop = new Properties();
        try {
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return prop;
    }

}