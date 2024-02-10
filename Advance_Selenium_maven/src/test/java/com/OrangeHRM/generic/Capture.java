package com.OrangeHRM.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture {
public static void captureScreen(WebDriver driver)
{
	Date d=new Date();
	String da=d.toString().replaceAll(":", "-");
	TakesScreenshot tss=(TakesScreenshot)driver;
	File tmp = tss.getScreenshotAs(OutputType.FILE);
	File pmt=new File("./photo/"+da+".jpg");
	try {
		FileHandler.copy(tmp, pmt);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
