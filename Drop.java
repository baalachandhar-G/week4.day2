package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("http://www.leafground.com/pages/drop.html");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Drag = Driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement Drop = Driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions Builder= new Actions(Driver);
		
		Builder.dragAndDrop(Drag, Drop).perform();
		
		Driver.close();
		
		
		
	}

}
