import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FirefoxDrv {

	public static void main(String args[]) throws Exception {
	    System.setProperty("webdriver.gecko.driver", "/home/hiren/Desktop/eclipseSpace/repo_sfTestAuto/geckodriver");
	    FirefoxOptions options = new FirefoxOptions();
	    options.setLogLevel(FirefoxDriverLogLevel.TRACE);
	    System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
	    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"Selenium.logs");
        WebDriver driver = new FirefoxDriver(options);
		
		String baseUrl = "https://sf.integ.monetago.com/";
		String email   = "bhagyashree@monetago.com";
		String pass    = "Test@123";
		Logger log 	   =  Logger.getLogger("devpinoyLogger");
		
	    log.debug("Started Journey to Testing SF-UI");
		driver.get(baseUrl);
	    WebElement weEmail = driver.findElement(By.name("email"));
	    weEmail.sendKeys(email);
	    log.debug("Entered Email is "+ email);
	    WebElement wePass  = driver.findElement(By.name("password"));
	    wePass.sendKeys(pass);
	    log.debug("Entered Password is "+ pass);
	    WebElement weCaptcha = driver.switchTo().frame(0).findElement(By.className("recaptcha-checkbox-border"));
	    weCaptcha.click();
	    Thread.sleep(1000);
	    WebElement weSubmit  = driver.switchTo().parentFrame().findElement(By.className("Button_button__14opc"));
	    weSubmit.click();
	    Thread.sleep(3000);
	    driver.close();
	}

}
