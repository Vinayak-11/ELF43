package Assigmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesandScreenShotinRediffmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Sign in")).click();
		//Thread.sleep(4000);
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("sumanthElfBatch@rediffmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Testing@123");
		driver.findElement(By.id("remember")).click();
		//Thread.sleep(1000);
		driver.findElement(By.name("proceed")).click();
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Write mail")).click();
		//Thread.sleep(6000);
		WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='TO_IDcmp2']"));
		EnterEmail.click();
		EnterEmail.sendKeys("sumanthElfBatch@rediffmail.com");
		//Thread.sleep(2000);
		WebElement subject = driver.findElement(By.xpath("(//input[contains(@type,'text')])[11]"));
		// subject.click();
		subject.sendKeys("Vinayak");
		WebElement Body = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(Body);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello Good AfterNoon");
		//Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("captchaText")).click();
		//Thread.sleep(1000);
		//captcha we can not enter nad its not able to automate in real time also so until project come to end otp,captcha like features made as dissable and it will tested manually at the end
		//WebElement inbox = driver.findElement(By.linkText("Inbox"));
		//inbox.click();

	}

}
