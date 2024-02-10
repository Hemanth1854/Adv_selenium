package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
@Test
public void run()
{
	WebDriverManager.chromedriver().setup();   //System.setProperty
	WebDriver driver=new ChromeDriver();
}
}
