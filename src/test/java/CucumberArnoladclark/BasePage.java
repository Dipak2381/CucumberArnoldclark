package CucumberArnoladclark;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static CucumberArnoladclark.BaseTest.driver;

/**
 * Created by DIPAK on 4/24/2017.
 */
public class BasePage extends BaseTest
{
    @BeforeMethod
    public void openBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.arnoldclark.com/");
    }

    @AfterMethod
    public void closeBrowser()

    {
        driver.quit();
    }

}
