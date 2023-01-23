package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUderstandTheSingleSelectDropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropDown);
		System.out.println("Day drown : "+ daySelect.isMultiple());
		List<WebElement> daydrownOptions = daySelect.getOptions();
		for(WebElement ele : daydrownOptions) {
			daySelect.selectByVisibleText(ele.getText());
			System.out.println(ele.getText()+" ");
		}
		daySelect.selectByIndex(10);
		System.out.println();
		System.out.println("*****************************************************************");
		
		Select monthSelect = new Select(monthDropDown);
		System.out.println("month down : "+ monthSelect.isMultiple());
		List<WebElement> monthDropDownOptions = monthSelect.getOptions();
		for(WebElement ele : monthDropDownOptions ) {
			System.out.println(ele.getText());
		}
		System.out.println();
		monthSelect.selectByValue("11");
		System.out.println("*****************************************************************");
		
		Select yearSelect = new Select(yearDropDown);
		System.out.println("year down : " + yearSelect.isMultiple());
		List<WebElement> yearDropDownOptions = yearSelect.getOptions();
		for(WebElement ele : yearDropDownOptions) {
			yearSelect.selectByVisibleText(ele.getText());
			Thread.sleep(100);
		}
		yearSelect.selectByVisibleText("1997");
		
	}

}
