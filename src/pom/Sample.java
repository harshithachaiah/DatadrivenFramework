package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
	@FindBy(id="//a[@class='button']")
	private WebElement btn;
	@FindBy(xpath="//input[@id='id_username']")
	private WebElement usernametb;
	@FindBy(xpath="//input[@id='id_password']")
	private WebElement passwordtb;
	@FindBy(xpath="//input[@id='login_button']")
	private WebElement loginbtn;
	
	public void sample(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
	}
	public void username(String dummy)
	{
		usernametb.sendKeys(dummy );
	}
	
	

}
