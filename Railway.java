package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  
		ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("https://erail.in");
		
		Driver.manage().window().maximize();
		
	    WebElement to = (WebElement) Driver.findElements(By.id("txtStationFrom"));
	    
	    Webelement.clear();
	    
	   
	    
	}
	
	

}