package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Auto_constant;
import Generic.Excel;

public class Validlogin implements Auto_constant {
static
{
	System.setProperty(key,value);
}
	public static void main(String[] args) throws InterruptedException {
		String us=Excel.abc(excelpath,"Sheet1",1,0);
		String pwd=Excel.abc(excelpath,"Sheet1",1,1);
WebDriver driver =new ChromeDriver();
driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/?gclid=Cj0KCQjw_7HdBRDPARIsAN_ltcJFeQGAG_ORgz82gTx1GAes-73fmBgbNTdIfHSaSVFzfLK3xG0dYG8aAkmCEALw_wcB&utm_source=google&utm_medium=cpc&utm_campaign=&utm_term=myntra&utm_content=&matchtype=e");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys(us);
driver.findElement(By.xpath("//input[@class='login-user-input-password login-user-input']")).sendKeys(pwd);
driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
		



	}

}
