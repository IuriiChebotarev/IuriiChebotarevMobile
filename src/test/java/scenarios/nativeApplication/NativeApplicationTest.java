package scenarios.nativeApplication;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import scenarios.Hooks;
import java.io.IOException;
import static nativeApplication.ContactManagerPages.ADD_CONTACT_PAGE;
import static nativeApplication.ContactManagerPages.DEFAULT_PAGE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test(groups = "native application")

public class NativeApplicationTest extends Hooks {
        protected NativeApplicationTest() throws IOException {
            super();
        }

        @Test(description = "Click on button 'Add contact' and verify and verify that contact's fields appear")
        public void testButonAndFields() throws Exception {
            //1.Assert default page title
            assertEquals(driver().findElement(By.id("android:id/title")).getText(), DEFAULT_PAGE.name);

            //2.Click on 'Add Contact' button
            String app_package_name = "com.example.android.contactmanager:id/";
            By add_btn = By.id(app_package_name + "addContactButton");
            driver().findElement(add_btn).click();

            //3.Assert form title and fields
            assertEquals(driver().findElement(By.id("android:id/title")).getText(), ADD_CONTACT_PAGE.name);
            assertTrue(driver().findElement(By.id("com.example.android.contactmanager:id/accountSpinner")).isDisplayed());
            assertTrue(driver().findElement(By.id("com.example.android.contactmanager:id/contactPhoneEditText")).isDisplayed());
            assertTrue(driver().findElement(By.id("com.example.android.contactmanager:id/accountSpinner")).isDisplayed());
        }
    }


