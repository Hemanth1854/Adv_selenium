package com.OrangeHRM.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class implements FrameworkConstant {
	WebDriver driver;
@BeforeMethod
public void openApp()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}
@AfterMethod
public void closeApp()
{
	driver.close();
}
}
