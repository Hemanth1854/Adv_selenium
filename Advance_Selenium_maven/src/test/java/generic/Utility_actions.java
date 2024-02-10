package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_actions {
	
	public static void mouse_hover(WebDriver driver,WebElement ele)
	{
		utility_objects.Actions_object(driver).moveToElement(ele).perform();
	}
	
	public static void mouse_hover_click(WebDriver driver,WebElement ele)
	{
		utility_objects.Actions_object(driver).moveToElement(ele).click(ele).perform();
	}
	
	public static void right_click(WebDriver driver, WebElement ele)
	{
		utility_objects.Actions_object(driver).contextClick(ele).perform();
	}
	
	public static void doubleclick(WebDriver driver, WebElement ele)
	{
		utility_objects.Actions_object(driver).doubleClick(ele).perform();
	}
	
	public static void drag_and_drop(WebDriver driver,WebElement ele,WebElement ele1)
	{
		utility_objects.Actions_object(driver).dragAndDrop(ele, ele1).perform();
	}
}

