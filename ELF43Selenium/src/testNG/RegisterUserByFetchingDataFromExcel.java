package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataDriven.ReadData;

public class RegisterUserByFetchingDataFromExcel {
	@DataProvider
	public static String[][] RegisterUserByFetchingDataFromExcel() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/SeleniumDataProvider.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet datasheet = workbook.getSheet("RegisterDemoWebShop");
		int rowcount = datasheet.getPhysicalNumberOfRows() - 1;
		int coloumncount = datasheet.getRow(0).getPhysicalNumberOfCells();

		String data[][] = new String[rowcount][coloumncount];
		for (int i = 1, k = 0; i <= rowcount; i++, k++) {
			for (int j = 0; j < coloumncount; j++) {
				data[k][j] = datasheet.getRow(i).getCell(j).toString();
			}
		}
		return data;

	}

	@DataProvider
	public String data() {
		return "vinayak";
	}

	@Parameters("browserName")
	@Test(dataProvider = "RegisterUserByFetchingDataFromExcel")
	public void createuser(String browserNameinfo, String data[]) {
		WebDriver driver = null;
		if (browserNameinfo.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserNameinfo.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserNameinfo.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
			driver = new OperaDriver();
		} else {
			throw new InvalidBrowserNameException();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/register");

		String gender = ReadData.fromExcelFile("RegisterDemoWebShop", 1, 0);
		String firstName = ReadData.fromExcelFile("RegisterDemoWebShop", 1, 1);
		String lastName = ReadData.fromExcelFile("RegisterDemoWebShop", 1, 2);
		String email = ReadData.fromExcelFile("RegisterDemoWebShop", 1, 3);
		String password = ReadData.fromExcelFile("RegisterDemoWebShop", 1, 4);
		String confirmpassword = ReadData.fromExcelFile("RegisterDemoWebShop", 1, 5);

		driver.findElement(By.id("gender." + data[0] + "")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data[1]);
		driver.findElement(By.id("LastName")).sendKeys(data[2]);
		driver.findElement(By.id("Email")).sendKeys(data[3]);
		driver.findElement(By.id("Password")).sendKeys(data[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[5]);
		driver.findElement(By.id("register-button")).click();

	}
}

class InvalidBrowserNameException extends RuntimeException {
	InvalidBrowserNameException() {
		super("Please enter valid browser");
	}

}
