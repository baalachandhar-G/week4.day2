package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver Driver= new ChromeDriver();
		
		Driver.get("https://www.nykaa.com/");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Actions Builder= new Actions(Driver);
		
		WebElement brand = Driver.findElement(By.xpath("//a[text()='brands']"));
		
	    Builder.moveToElement(brand).perform();
	    
	    Driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
	    
	    Driver.findElement(By.linkText("L'Oreal Paris")).click();
	    
	    String title = Driver.getTitle();
	    
	     if(title.contains("L'Oreal Paris")) {
		   
		   System.out.println("The Title is Loreal Paris");
	
		  }else {
			  
			  System.out.println("The Title is wrong");
		  }
	     
	     
	     Driver.findElement(By.xpath("//button[@class=' css-n0ptfk']")).click();
	     
	     Driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();
	     
	     
	     
	     Driver.findElement(By.xpath("//div[@class='filter-open css-1kwl9pj']")).click();
	     
	     Driver.findElement(By.xpath("//span[text()='Hair']/parent::div[@class=' css-b5p5ep']")).click();
	     
	      Driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	      
	      Driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	      
	      Driver.findElement(By.xpath("//span[text()='Concern']")).click();
	      
	      Driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	      
	      
	    
	      
	      
	      boolean displayed = Driver.findElement(By.xpath("//span[text()='Filters Applied']/following::span[text()='Shampoo']")).isDisplayed();
	      
	      
	     if(displayed == true) {
	    	 
	    	 System.out.println("Success");
	     }else {
	    	 
	    	 System.out.println("Failed");
	     }
	     
	     Driver.findElement(By.xpath("//div[@class='css-1rd7vky']/div")).click();	 
	     
	     Set<String> windowHandles = Driver.getWindowHandles();
	      
	      List<String> window= new ArrayList<String>(windowHandles);
	      
	      String newwindows = window.get(1);
	      
	      Driver.switchTo().window(newwindows);
	     
	      
	      //Select size of 175 Ml
	      
	      Driver.findElement(By.xpath("//select[@title='SIZE']//option[text()='175ml']")).click();
	      
	      //Get the MRP price of the Product
	      
	      String Price = Driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
	      
	      System.out.println("The MRP of the Shampoo :"+Price);
	      
	      //Add to Bag
	      
	      Driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	      
	      System.out.println("Add to the Bag"+"\n");
	      
	      
	      //Go to shopping bag
	      
	      Driver.findElement(By.xpath("//span[@class='cart-count']/parent::button")).click();
	      
	      System.out.println("Go to the shopping bag");
	      
	      
	      //Print the Grand total
	      
	      Driver.switchTo().frame(0);
	      
	      String GrandTotal = Driver.findElement(By.xpath("//div[@class='first-col']/div[@class='value']")).getText();
	      
	      System.out.println("The Grand Total Price"+GrandTotal);
	      
	      
	      //Click on proceed
	      
	      Driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	      
	      Driver.switchTo().defaultContent();
	      
	      //Continue as guest
	      
	      Driver.findElement(By.xpath("//button[@class='btn full big']")).click();
	      
	      System.out.println("Continueus as Guest");
	      
	      //overall total value
	      
	      String finalValue = Driver.findElement(By.xpath("//div[text()='Grand Total']/following-sibling::div[@class='value']")).getText();
	      
	      System.out.println("Grand Total Value :"+finalValue);
	      
	      if(finalValue.contains(Price)) {
	    	 
	    	  System.out.println("Success both the grand total amount are same");
	      }else {
	    	  System.out.println("Failed both the grand total amount is different");
	      }
	      
	      //Close all the windows
	      
	      Driver.close();
	      
	}

}
