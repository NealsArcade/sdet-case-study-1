package org.example.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.example.util.TestUtil;
import org.example.util.WebEventListener;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TestBase {

	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	protected static WebDriver driver;
	protected static Properties prop =  new Properties();
	protected static WebEventListener eventListener;

	protected TestBase() {
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +
					"\\src\\main\\java\\org\\example\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			log.error("File not found.! {}",e.getMessage());
		} catch (IOException e) {
			log.error("IO Exception {}", e.getMessage());
		}

	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");
		boolean headlessMode = Boolean.parseBoolean(prop.getProperty("headless", "false"));

        switch (browserName.toLowerCase()) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setAcceptInsecureCerts(true);
                driver = new ChromeDriver(chromeOptions);
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setAcceptInsecureCerts(true);
                driver = new FirefoxDriver(firefoxOptions);
            }
            case "edge" -> {
                // Setup WebDriverManager to automatically download and configure the Edge
                // driver
                WebDriverManager.edgedriver().setup();
                // Create EdgeOptions instance
                EdgeOptions edgeOptions = new EdgeOptions();
                // Set desired capabilities for Edge browser
                if (headlessMode) {
                    edgeOptions.addArguments("--headless=new"); // Use --headless=new for Edge versions 109.0.1518.55 and above.
                }
                edgeOptions.setAcceptInsecureCerts(true);

                // Create EdgeDriver instance
                driver = new EdgeDriver(edgeOptions);
            }
			default -> {
			        log.error("Invalid browser name specified.! {}", browserName);
			        System.exit(0);
			    }
        }

		// Listener class to give console output of the action performed on the browser
		eventListener = new WebEventListener();
		WebDriverListener listener = new WebEventListener();
		driver = new EventFiringDecorator<>(listener).decorate(driver);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));

		driver.get(prop.getProperty("url"));

	}
}
