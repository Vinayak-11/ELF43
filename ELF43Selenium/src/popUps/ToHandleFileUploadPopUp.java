package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,15);			
		
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.findElement(By.id("file-upload")).sendKeys("E:/SI_resize_93_resize_37.jpg");
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		driver.findElement(By.id("file-upload")).sendKeys("E:/TY Vinayak N M Resume.docx");

	}

}
