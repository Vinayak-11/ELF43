package Assigmets;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRemoveLowestPriceItemFromCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//popup cancelation
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//addidas shoes
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("addidas shoes for men",Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(text(),'TURBO GLIDE M Running Shoes For Men')]")).click();
		Set<String> addidaswindows = driver.getWindowHandles();
		for(String addidaswindowId:addidaswindows) {
			driver.switchTo().window(addidaswindowId);
		}
		driver.findElement(By.xpath("//a[text()='11']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		//puma shoes
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("puma shoes for men",Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Puma Vellfire Casuals For Men']")).click();
		Set<String> pumawindows = driver.getWindowHandles();
		for(String pumawindowId:pumawindows) {
			driver.switchTo().window(pumawindowId);
		}
		driver.findElement(By.xpath("//a[text()='11']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart'] ")).click();
		
		//nike shoes
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nike shoes for men 2022",Keys.ENTER);
		driver.findElement(By.xpath("(//a[contains(text(),'NK DOWNSHIFTER 12 Running Shoes For Men')])[1]")).click();
		Set<String> nikewindows = driver.getWindowHandles();
		for(String nikewindowId:nikewindows) {
			driver.switchTo().window(nikewindowId);
		}
		driver.findElement(By.xpath("//a[text()='11']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		
		//driver.quit();
		
		
	}

}
