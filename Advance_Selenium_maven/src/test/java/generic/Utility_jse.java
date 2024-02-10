package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_jse {

	public static void jss_Scroll(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jss = utility_objects.jase(driver);
		jss.executeScript("arguments[0].scrollIntoView()", ele);
	}
	
	public static void disabled_ele(WebDriver driver,WebElement ele,String value)
	{
		JavascriptExecutor jss = utility_objects.jase(driver);
		jss.executeScript("arguments[0].value='"+value+"'", ele);
	}
}


