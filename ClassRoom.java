package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("https://erail.in/");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement findElement = Driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		
		findElement.clear();
		
		findElement.sendKeys("MS");
		
		Thread.sleep(500);
		
		findElement.sendKeys(Keys.TAB);
		
		WebElement findElement2 = Driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		
		findElement2.clear();
		
		findElement2.sendKeys("MDU");
		
		Thread.sleep(500);
		
		findElement2.sendKeys(Keys.TAB);
		
		Driver.findElement(By.id("chkSelectDateOnly")).click();
	
		int size = Driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
		
		List<String> Trainname= new ArrayList<String>();
	
		for(int i=1;i<size;i++) {
			 String text = Driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a")).getText();
			 Trainname.add(text);
		
		}
		
		Set<String> duplicated= new HashSet<String>(Trainname);
		
		if(Trainname.size() == duplicated.size()) {
			
			System.out.println("No Duplicated Name");
		}else {
			
			System.out.println("Having Duplicated Train Name");
		}
	}

}
