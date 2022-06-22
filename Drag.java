package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("http://www.leafground.com/pages/drag.html");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement findElement = Driver.findElement(By.id("draggable"));
		
		Actions Builder=new Actions(Driver);
		
		Builder.dragAndDropBy(findElement, 80, 100).perform();
		   
	}

}
