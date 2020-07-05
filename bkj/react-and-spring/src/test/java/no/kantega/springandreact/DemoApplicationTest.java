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
	    
	    //크롤링이 아니라 웹 url에 대한 테스트용 코드라고 봐야 맞다
//	    driver.get("로그인 URL"); // 로그인 페이지로 이동 합니다.
//	    WebElement id = driver.findElement(By.id("id"));
//	    id.clear();
//	    id.sendKeys("아이디"); // 아이디 입력 필드에 '아이디'를 입력 합니다.
//	    WebElement pw = driver.findElement(By.id("pw"));
//	    pw.clear();
//	    pw.sendKeys("비밀번호"); // 비빌번호 입력 필드에 '비밀번호'를 입력 합니다.
//	    WebElement button = driver.findElement(By.cssSelector("#login > form > fieldset > button"));
//	    button.submit(); // Form 전송.
//	    // Form 전송 후 로그인 완료 페이지로 이동하여 페이지가 완전히 랜더링 될 때 까지 대기 헙니다.
//	    new WebDriverWait(driver, 10).until(ExpectedConditions.urlToBe("로그인 완료 URL"));
//	    new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) d ->
//	        ((JavascriptExecutor) d).executeScript("return jQuery.active == 0").equals(Boolean.TRUE));
	    
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