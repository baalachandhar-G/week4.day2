package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("hhttp://www.leafground.com/pages/sortable.html");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement item3 = Driver.findElement(By.xpath("//li[text()='Item 3']"));
		
		WebElement item6 = Driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		Actions Builder= new Actions(Driver);
		
		Builder.clickAndHold(item3).moveToElement(item6).release().perform();
		
		WebElement Item1 = Driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		WebElement Item5 = Driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		
		Builder.clickAndHold(Item1).moveToElement(Item5).release().perform();
		
		Driver.close();
		
		
		
	}

}
