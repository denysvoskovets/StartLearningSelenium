import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RozetkaRegistration {
	
	private static String email;
	
	public static void main(String[] args){
		
		email = EmailRandomizer.random();
		
		System.out.println(email);
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://rozetka.ua");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id='header_user_menu_parent']/a")).click();
	driver.findElement(By.xpath("//div[@class='auth-f-signup']/a[@href='https://my.rozetka.com.ua/signup/']")).click();
	driver.findElement(By.xpath("//*[@id='signup_form']/div[1]/input")).sendKeys("Denys");
	driver.findElement(By.xpath("//*[@id='signup_form']/div[2]/input")).sendKeys(email);
	driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/input")).sendKeys("123456qwerty");
	driver.findElement(By.xpath("//*[@id='signup_form']/div[@class='signup-submit']/span/button")).click();
}
}