package scenarios;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import setup.DriverSetup;
import setup.PropertyFiles;

import java.io.IOException;

@Test(groups = {"native", "web"})
public class Hooks extends DriverSetup {

    /**
     * Required variables will be initialized by inherited constructor
     * @throws IOException
     */
    protected Hooks() throws IOException {
        super();
    }

    @Parameters(value = {"testType"})
    @BeforeSuite(description = "Prepare driver to run test(s)")
    public void setUp(String testType) throws Exception {
        prepareDriver(PropertyFiles.valueOf(testType));
        System.out.println("Driver prepared");
    }

    @AfterSuite(description = "Close driver on all tests completion")
    public void tearDown() throws Exception {
        driver().quit();
        System.out.println("Driver closed");
    }
}

