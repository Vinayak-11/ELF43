package ViaProjectScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBasePage {
	
	// step 1: create constructor:
	public HotelBasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Step 2:create basePage:
	
	@FindBy(id="Hotels")
	private WebElement hotels;
	
	@FindBy(id = "destination")
	private WebElement Destination;
	
	@FindBy(id="checkIn")
	private WebElement checkIn;
	
	@FindBy(id="checkOut")
	private WebElement checkOut;
	
	@FindBy(id="nationalityCountry")
	private WebElement nationalityCountry;
	
	@FindBy(xpath ="//div[contains(@class,'hotelRoom')]")
	private WebElement hotelRoom;
	
	@FindBy(xpath = "//div[text()=' Add Rooms']")
	private WebElement addroomsbutton;
	
	@FindBy(xpath = "(//div[@class='minus'])[1]")
	private WebElement AdultDecrement;
	
	@FindBy(xpath = "(//div[@class='plus'])[1]")
	private WebElement AdultIncrement;
	
	@FindBy(xpath = "(//div[@class='minus'])[2]")
	private WebElement ChildernDecrement;
	
	@FindBy(xpath = "(//div[@class='plus'])[2]")
	private WebElement ChildernIncrement;
	
	@FindBy(xpath = "(//span[text()='Remove Room '])[2]")
	private WebElement RemoveRoom;
	
	@FindBy(xpath = "//div[text()='Done!']")
	private WebElement DoneButton;
	
	@FindBy(xpath = "//div[text()='Cancel']")
	private WebElement CancelButton;
	
	@FindBy(xpath = "//div[contains(text(),'Search Hotels')]")
	private WebElement SearchButton;
	
	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getDestination() {
		return Destination;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getNationalityCountry() {
		return nationalityCountry;
	}

	public WebElement getHotelRoom() {
		return hotelRoom;
	}

	public WebElement getAddroomsbutton() {
		return addroomsbutton;
	}

	public WebElement getDoneButton() {
		return DoneButton;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}
	
	public WebElement getAdultDecrement() {
		return AdultDecrement;
	}

	public WebElement getAdultIncrement() {
		return AdultIncrement;
	}

	public WebElement getChildernDecrement() {
		return ChildernDecrement;
	}

	public WebElement getChildernIncrement() {
		return ChildernIncrement;
	}

	public WebElement getRemoveRoom() {
		return RemoveRoom;
	}

}
