import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CompareGoods {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://hotline.ua");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='lv-1-193']/a/b")).click();
		
		driver.findElement(By.xpath("//div[@class='text']")).click();
		//WebElement dropdown = driver.findElement(By.xpath("//div[text()='Выберите категорию']")); //будем выбирать категорию из дроп списка
		driver.findElement(By.xpath("//ul[@style='list-style:none']/li[.='TV-тюнеры']")).click();
		driver.findElement(By.xpath("//a[@class='but-box cell but-blue fl js-view-result g_statistic']")).click();
		driver.findElement(By.xpath("//*[@id='catalogue']/div[@class='cell gd']/div[1]/div[@class='cell gd-box']/div[1]/div[@class='rel gd-info-cell']/div[@class='cell gd-item-nav']/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='catalogue']/div[5]/div[2]/div/div/div[3]/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='cmp-popup-button']")).click();
		driver.findElement(By.xpath("//*[@id='card-cmp-popup']/div[2]/button[1]")).click();
		
	}

}
