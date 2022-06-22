package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizeable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("https://jqueryui.com/resizable");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Driver.switchTo().frame(0);
		
		WebElement findElement = Driver.findElement(By.xpath("(//div[@id='resizable']/div)[3]"));
		
		Actions builder= new Actions(Driver);
		
		builder.clickAndHold(findElement).moveByOffset(100,90).release(findElement).perform();
		
       //Driver.close();
		
		
		
	}

}
