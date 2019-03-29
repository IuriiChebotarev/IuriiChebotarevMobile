package setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    Properties currentProps = new Properties();

    Properties getCurrentProps(PropertyFiles propertyFiles) throws IOException {
        FileInputStream in = new FileInputStream(System.getProperty("user.dir") + propertyFiles.propertyName);
        currentProps.load(in);
        in.close();
        return currentProps;
    }

    protected String getProp(PropertyFiles propertyFiles, String propKey) throws IOException {
        if(!currentProps.containsKey(propKey)) currentProps = getCurrentProps(propertyFiles);
        // "default" form used to handle the absence of parameter
        return currentProps.getProperty(propKey, null);
    }
}
