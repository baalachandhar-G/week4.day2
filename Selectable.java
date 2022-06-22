package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		    
		    ChromeDriver Driver= new ChromeDriver();
			
			Driver.get("http://www.leafground.com/pages/selectable.html");
			
			Driver.manage().window().maximize();
			
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement Item1 = Driver.findElement(By.xpath("//li[text()='Item 1']"));
			
			WebElement Item2 = Driver.findElement(By.xpath("//li[text()='Item 2']"));
			
			WebElement Item4 = Driver.findElement(By.xpath("//li[text()='Item 4']"));
			
			Actions Builder= new Actions(Driver);
			
			Builder.keyDown(Keys.CONTROL).click(Item1).click(Item2).click(Item4).keyUp(Keys.CONTROL).perform();
			
			WebElement Item6 = Driver.findElement(By.xpath("//li[text()='Item 6']"));
			
			WebElement Item7 = Driver.findElement(By.xpath("//li[text()='Item 7']"));
			
			Builder.clickAndHold(Item6).clickAndHold(Item7).release().perform();
			
			
			
	}

}
