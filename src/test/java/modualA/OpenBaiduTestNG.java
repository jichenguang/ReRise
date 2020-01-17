package modualA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class OpenBaiduTestNG {
	
	public WebDriver driver;
	

	
  @BeforeClass
  public void setUp() {
	  
	//定义gecko driver的获取地址ַ
      System.setProperty("webdriver.gecko.driver", "D:\\Tommrow\\BrowserDriver\\geckodriver.exe");
		
     //创建一个叫driver的对象，启动火狐浏览器
     driver = new FirefoxDriver();
	  }	

  @Test
  public void openBaidu() throws InterruptedException {
	  
	//ͨ通过对象driver调用具体的get方法来打开网页
      driver.get("https://www.baidu.com/");
      
      //最大化浏览器窗口
      driver.manage().window().maximize();
      
      Thread.sleep(3000);
      
     Assert.assertEquals(driver.getTitle(), "百度一下，你就知道");  
     
     WebElement baiduButton = driver.findElement(By.id("su"));
          
     Assert.assertTrue(baiduButton.isDisplayed());
      
      
  }
  

  @AfterClass
  public void tearDown() {
	  
      //退出浏览器
      driver.quit();
  }



}
