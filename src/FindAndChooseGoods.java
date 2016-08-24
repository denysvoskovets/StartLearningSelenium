import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindAndChooseGoods {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://hotline.ua");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='lv-1-193']/a/b")).click();
		
		driver.findElement(By.xpath("//div[@class='text']")).click();
		//WebElement dropdown = driver.findElement(By.xpath("//div[text()='�������� ���������']")); //����� �������� ��������� �� ���� ������
		driver.findElement(By.xpath("//ul[@style='list-style:none']/li[.='TV-������']")).click();
		driver.findElement(By.xpath("//a[@class='but-box cell but-blue fl js-view-result g_statistic']")).click();
		driver.findElement(By.xpath("//*[@id='catalogue']/div[5]/div[1]/div/div/div[3]/div[2]/div[2]/a")).click();
		
		
		

	}

}
