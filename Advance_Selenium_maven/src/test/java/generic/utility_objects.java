package generic;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class utility_objects {
	public static Actions Actions_object(WebDriver driver)
	{
		Actions act = new Actions(driver);
		return act;
	}
	
	public static Select select_objects(WebElement ele)
	{
		Select sel = new Select(ele);
		return sel;
	}
	
	public static JavascriptExecutor jase(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		return jse;
	}
	

}
