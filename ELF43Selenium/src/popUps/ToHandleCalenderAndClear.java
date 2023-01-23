package popUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalenderAndClear {

	public static void main(String[] args) {
		LocalDateTime systemsDateTime = LocalDateTime.now().plusYears(1);
		String monthName = systemsDateTime.getMonth().name();
		int year = systemsDateTime.getYear();
		int day = systemsDateTime.getDayOfMonth();
		//System.out.println(monthName); //DECEMBER
		//System.out.println(year); //2022
		//System.out.println(day); //current system date
		String month = ""+monthName.charAt(0)+monthName.substring(1, monthName.length()).toLowerCase(); //DECEMBER
																										//December to print in this format using JAVA code
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver,15);
		JavascriptExecutor js= (JavascriptExecutor) driver; 
		Actions actions=new Actions(driver);
		 
		driver.get("https://www.makemytrip.com/");
		actions.click().perform();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		//driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
				break;
			}
			catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

	}

}
