package br.com.infnet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

public class WebTestTest {
    private static final String URL = "https://example.com/";
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
    }

    @Test
    public void testaPaginaHome() {
        driver.get(URL);

        String title = driver.getTitle();
        assertEquals("Example Domain", title);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver = null;
        }
    }
}
