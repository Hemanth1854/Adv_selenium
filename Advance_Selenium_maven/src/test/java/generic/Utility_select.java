package generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_select {

	public static void sele_object(WebElement ele,Object data)
	{
		Select sel = utility_objects.select_objects(ele);
		if(data instanceof Integer)
		{
			sel.selectByIndex((Integer)data);
		}
		else if(data instanceof String)
		{
			try {
				sel.selectByValue((String)data);
			} catch (Exception e) {
				sel.selectByVisibleText((String)data);
			}
		}
	}
	
	public static void desele_object(WebElement ele,Object data)
	{
		Select sel = utility_objects.select_objects(ele);
		if(data instanceof Integer)
		{
			sel.deselectByIndex((Integer)data);
		}
		else if(data instanceof String)
		{
			try {
				sel.deselectByValue((String)data);
			} catch (Exception e) {
				sel.deselectByVisibleText((String)data);
			}
		}
	}
	
	public static void desel_All(WebElement ele)
	{
		Select sel = utility_objects.select_objects(ele);
		sel.deselectAll();
	}
	
	
	public static List<WebElement> get_options(WebElement ele)
	{
		Select sel = utility_objects.select_objects(ele);
		return sel.getOptions();
	}
	
	
	public static List<WebElement> get_All_sel_options(WebElement ele)
	{
		Select sel = utility_objects.select_objects(ele);
		return sel.getAllSelectedOptions();
	}	
	
	public static WebElement get_First_sel_option(WebElement ele)
	{
		Select sel = utility_objects.select_objects(ele);
		return sel.getFirstSelectedOption();
	}
	
	public static boolean is_multiple(WebElement ele)
	{
		Select sel = utility_objects.select_objects(ele);
		return sel.isMultiple();
	}
}
