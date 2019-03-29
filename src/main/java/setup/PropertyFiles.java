package setup;

public enum PropertyFiles {

    NATIVE_TEST_PROPERTIES("/native.properties"),
    WEB_TEST_PROPERTIES("/web.properties");

    public String propertyName;

    PropertyFiles(String propertyName) {
        this.propertyName = propertyName;
    }
}

