 package Assigmets;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreetStudyTableTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//step1:open the wooden street
		driver.get("https://www.woodenstreet.com/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
		Thread.sleep(5000);
		
		//step2:select the study table
		driver.findElement(By.xpath("//p[text()='Study Tables']")).click();
		Thread.sleep(5000);
		
		//step3:fetch the cost of 2nd product
		String product = "";
		driver.findElement(By.xpath("(//div[contains(@id,'article')])[2]["+product+"]//strong[contains(text(),'Rs')]")).getText();
		
		
	}

}
