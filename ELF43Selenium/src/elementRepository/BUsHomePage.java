package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BUsHomePage {
	
	public BUsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "One way")
	private WebElement OnewayLink;
	
	@FindBy(linkText = "Round trip")
	private WebElement roundtripLink;
	
	@FindBy(id = "src")
	private WebElement fromTextField;
	
	@FindBy(id="dest")
	private WebElement fromTotextField;
	
	@FindBy(id="departure")
	private WebElement deptDateTextField;
	
	@FindBy(id="return")
	private WebElement returntextField;
	
	@FindBy(xpath = "//input[@value='Search Buses' and contains(@class,'search-journey')]")
	private WebElement searchBusbutton;
	
	@FindBy(xpath = "//li[.='Bangalore']")
	private WebElement bangaloreSearchSuggestion;
	
	@FindBy(xpath = "//li[.='Goa']")
	private WebElement goaSearchSuggestion;
	
	@FindBy(xpath = "//li[.='Chennai']")
	private WebElement chennaiSearchSuggestion;
	
	@FindBy(xpath = "//li[.='Hyderabad']")
	private WebElement hyderabadSearchSuggestion;

	public WebElement getOnewayLink() {
		return OnewayLink;
	}

	public WebElement getRoundtripLink() {
		return roundtripLink;
	}

	public WebElement getFromTextField() {
		return fromTextField;
	}

	public WebElement getFromTotextField() {
		return fromTotextField;
	}

	public WebElement getDeptDateTextField() {
		return deptDateTextField;
	}

	public WebElement getReturntextField() {
		return returntextField;
	}

	public WebElement getSearchBusbutton() {
		return searchBusbutton;
	}

	public WebElement getBangaloreSearchSuggestion() {
		return bangaloreSearchSuggestion;
	}

	public WebElement getGoaSearchSuggestion() {
		return goaSearchSuggestion;
	}

	public WebElement getChennaiSearchSuggestion() {
		return chennaiSearchSuggestion;
	}

	public WebElement getHyderabadSearchSuggestion() {
		return hyderabadSearchSuggestion;
	}
	
	
	
}
