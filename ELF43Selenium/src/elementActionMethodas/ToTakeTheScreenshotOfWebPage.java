package elementActionMethodas;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeTheScreenshotOfWebPage {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		 File tempsc = ts.getScreenshotAs(OutputType.FILE);
		 File permtsc = new File("C:\\Users\\Vinayak\\Documents\\Java Programs//vinnu.png");
		 tempsc.renameTo(permtsc);
		System.out.println(tempsc);
	}

}
