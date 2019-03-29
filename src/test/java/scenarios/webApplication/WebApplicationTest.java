package scenarios.webApplication;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import scenarios.Hooks;
import java.io.IOException;

@Test(groups = "web")
public class WebApplicationTest extends Hooks {
    protected WebApplicationTest() throws IOException {
        super();
    }

    @Test(description = "Open website")
    public void webTest() throws Exception {
        //Open site
        driver().get(SUT);
        driverWait().until(ExpectedConditions.urlToBe(SUT + "/"));
        System.out.println("Site opening done");
    }
}
