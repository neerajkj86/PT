package com.sample.firstmavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utiity.Configreader;

public class PropertyDemo3 
{
	
	WebDriver driver;
	@Test
	public void ReadProprtyFile() throws IOException
	{
		
		Configreader config = new Configreader();
		
		
		
		//System.out.println("ChromePath is " + ChromePath);

		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		
		driver = new ChromeDriver();
		
		driver.get(config.getURL());
	}

}
