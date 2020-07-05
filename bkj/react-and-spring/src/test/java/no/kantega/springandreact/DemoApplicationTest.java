package no.kantega.springandreact;

import java.util.Iterator;
import java.util.List;

import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
 
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {
 
	@Before
	public void before() {
	    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	}
	@Test
	public void selenium_example() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("headless"); //실제로 브라우저를 띄우지 않는 방식으로 하게 해줌

	    WebDriver driver = new ChromeDriver(options); // 브라우저 실행
	    
	    String url = "h" + "ttps://brunch.co.kr/search?q=스프링 부트&type=article";
	    driver.get(url); // Scraping 할 페이지로 이동 합니다.
	    WebDriverWait buffer = new WebDriverWait(driver, 10);
    	
	    synchronized (buffer) {
    		buffer.wait(5000);
		}
	    
	    List<WebElement> title = driver.findElements(By.cssSelector("#resultArticle > div > div.result_article > div.wrap_article_list > ul > li > a > div.post_title.has_image > strong"));
	    System.out.println(title.size());
	    Iterator<WebElement> ie1 = title.iterator();
	    while(ie1.hasNext()) {
	    	System.out.println(ie1.next().getText());
	    }
	    
	    
	    driver.quit(); // 브라우저 종료
	}
}