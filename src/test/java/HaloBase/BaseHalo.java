package HaloBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseHalo {
    public static WebDriver driver;
    public static WebDriverWait wdwait;



    @Before
    public void setUp() {


        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.halooglasi.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
        driver.quit();
    }

}
