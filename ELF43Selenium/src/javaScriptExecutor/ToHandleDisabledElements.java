package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//disabled text box
		/*driver.get("https://www.skillrary.com/");
		WebElement textBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(textBox.isEnabled());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Vinayak';", textBox);*/
		
		//clear the content in text field
		/*driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement textbox =driver.findElement(By.id("uswername"));
		JavascriptExecutor jscript=(JavascriptExecutor) driver;
		jscript.executeScript("arguments[0].value='';", textbox);*/
		
		//disabled button
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase7-archive-downloads.html");
		driver.findElement(By.partialLinkText("jre-7u80-windows-i586")).click();
		WebElement disableButton = driver.findElement(By.xpath("//a[text()='Download jre-7u80-window"));
		JavascriptExecutor javascript=(JavascriptExecutor) driver;
		javascript.executeAsyncScript("argumets[0].click();", disableButton);
	}

}
