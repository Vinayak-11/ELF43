package ViaProjectScript;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TCID_001_Destiation extends BaseClass {
	@Test
	public void Destinationloc() {
		
		HotelBasePage hbp = new HotelBasePage(drivers);
		
		hbp.getHotels().click();
		Reporter.log("Hotels home page should display");
		
		hbp.getDestination().click();
		Reporter.log("Place holder should disapear");
	}
	
}
