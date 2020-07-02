package no.kantega.springandreact;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/api/hello")
    public String hello() {
        return "Hello,12321 the time at the server is now " + new Date() + "\n";
    }
    
    @RequestMapping("/api/crawling")
    public void crawling() throws IOException {
    	System.out.println(123);
    	String URL = "https://www.zerocho.com/";
    	Document doc = Jsoup.connect(URL).get();
    	Elements elem = doc.select("li");
    	
    	Iterator<Element> ie1 = elem.select("b").iterator();
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
    }
}
