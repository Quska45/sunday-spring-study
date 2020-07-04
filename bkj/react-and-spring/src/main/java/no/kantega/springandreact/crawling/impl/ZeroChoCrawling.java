package no.kantega.springandreact.crawling.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import no.kantega.springandreact.collection.Content;
import no.kantega.springandreact.crawling.Crawling;

/**
 * @author qusrh
 * @description : 1. 크롤링에 대한 데이터를 만들어주는 클래스로 생각하고 만들었다. 개발자간의 혼동을 막기 위해서 인터페이스는 필수라고 생각한다.
 *                2. 그케 크롤링된 값을 collection(dto나 vo로 쓰는게 더 좋은 것 같다.)의 형태로 리턴해주는 역할이라고 보면 될것 같다. 
 */
public class ZeroChoCrawling implements Crawling {
	@Override
	public List<Content> crawling() {
		// TODO Auto-generated method stub
		List<Content> contentList = new ArrayList<Content>();
		
		try {
			String URL = "https://www.zerocho.com/";
			Document doc = Jsoup.connect(URL).get();
			Elements elem = doc.select("li");
			
			Iterator<Element> ie1 = elem.select("b").iterator();
			
			//오늘 날짜
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			
			//크롤링한 데이터 넣어주기
			//DTO와 크롤링에 대한 인터페이스가 확실하게 정해질 수 있다면 이런것도 공통화 해서 쓸 수 있다고 본다.
			while(ie1.hasNext()) {
				//System.out.println(ie1.next().text());
				Content content = new Content();
				
				String data = ie1.next().text();
				
				content.setTitle(data);
				content.setContent(data);
				content.setOwnerName("zero cho");
				content.setReadCount("10");
				content.setRegDate(dateFormat.format(date));
				
				contentList.add(content);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return contentList;
	}
	
}
