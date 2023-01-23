package Assigmets;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToRemoveProductFromFlipkartCart {
	
	public static WebDriver driver;
	public static WebDriverWait explicitWait;
	public static Map<Integer,String> productDetails = new TreeMap<>();
	public static JavascriptExecutor js;

	public static void main(String[] args) {
		//Step 1 & 2 Open Browser and Navigate to Flipkart
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		explicitWait=new WebDriverWait(driver,15);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	
		//Step 3 & 4 : Search and Add 3 Different Products to cart
		searchandAddProduct("APPLE");
		searchandAddProduct("REDMI");
		searchandAddProduct("realme");
		
		//Step 5 : Remove the Lowest Priced Product
		driver.findElement(By.linkText("Cart")).click();
		String LowestProduct="";
		driver.findElements(By.xpath("//div[contains(@style,'box-show')]//span[contains(text(),'₹')])[position()mod 2=0]"));
		Map<Integer, String> prices = null;
		for(int i=1; i<=prices.size();i++) {
			int price=Integer.parseInt(prices.get(i-1).replace("₹","").replace(",",""));
			productDetails.put(price, "Product"+ i + "");
		}
		Set<Integer> costsOfProduct = productDetails.keySet();
		for(int lowestCost : costsOfProduct) {
			LowestProduct = productDetails.get(lowestCost);
			break;
		}
		char indexOfRemoveButton = LowestProduct.charAt(LowestProduct.length()-1);
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='Remove'])["+ indexOfRemoveButton +"]")).click();
				break;
			}
			catch(ElementClickInterceptedException e) {
				js.executeScript("window.scrollBy(0,250)");
			}
		}
		driver.findElement(By.xpath("\"//div[text()='Remove Item']/..//div[text()='Remove']\"")).click();
		
	}
		
		public static void searchandAddProduct(String product) {
			driver.findElement(By.name("q")).click();
			driver.findElement(By.name("q")).sendKeys(product,Keys.ENTER);
			driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone 13')]/..)[1]")).click();
			String parentwindowId = driver.getWindowHandle();
			Set<String> allwindows = driver.getWindowHandles();
			allwindows.remove(parentwindowId);
			for(String windowId : allwindows) {
				driver.switchTo().window(windowId);
			}
			explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			driver.close();
			driver.switchTo().window(parentwindowId);
			
			driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"a");
			driver.findElement(By.name("q")).sendKeys(Keys.DELETE);
			
		}
		
		

	}

	

