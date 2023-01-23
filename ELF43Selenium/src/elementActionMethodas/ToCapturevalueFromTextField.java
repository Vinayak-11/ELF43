package elementActionMethodas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturevalueFromTextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		//to capture value from SearchTextBox
	    WebElement searchTextBox = driver.findElement(By.id("small-searchterms"));
	    searchTextBox.sendKeys("Vinayak");
	    Object attrvalue = searchTextBox.getAttribute("value");
	    Thread.sleep(1000);
	    
	    //to capture tooltip text
	    System.out.println(driver.findElement(By.xpath("//span[text()='Shopping cart']")).getAttribute("title"));
	    Thread.sleep(1000);
		
	    //to capture alternate text for images
	    driver.get("https://www.kalkifashion.com/");
	    System.out.println(driver.findElement(By.xpath("//img[@alt='Product Image']")).getAttribute("alt"));
	    Thread.sleep(1000);

	}

}
