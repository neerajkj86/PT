package com.sample.firstmavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utiity.Configreader;

public class PropertyDemo 
{
	WebDriver driver;
	Configreader config ;
	@BeforeTest
	public void setup()
	{
		config = new Configreader();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		
		
	}
	
	@Test
	public void ReadProprtyFile() throws IOException
	{
		
		
		
		
		
		//System.out.println("ChromePath is " + ChromePath);

		
		driver = new ChromeDriver();
		
		driver.get(config.getURL());
	
		driver.quit();
	}
	

}
