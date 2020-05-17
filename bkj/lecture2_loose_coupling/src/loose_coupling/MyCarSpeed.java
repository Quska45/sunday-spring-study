package loose_coupling;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl;

public class MyCarSpeed {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		//파일 읽어 옴. 상대경로로 못가져오던데 왜 그런지 모르겠음
		FileInputStream fis = new FileInputStream("C:\\Users\\qusrh\\git\\sunday-spring-study\\bkj\\lecture2_loose_coupling\\src\\loose_coupling\\myCar.xml");
		//xml의 DOM구조를 읽어올 수 있도록 하는 코드
		DocumentBuilderFactory docBuildFac = new DocumentBuilderFactoryImpl();
		DocumentBuilder docBuild = docBuildFac.newDocumentBuilder();
		Document doc = docBuild.parse(fis);
		
		System.out.println(doc.getDocumentElement().getNodeName());
		fis.close();
		
		String carName = doc.getDocumentElement().getNodeName();
		
		//Class는 나중에 공부해야 겠다.
		Class claz = Class.forName(carName);
		Car car = (Car) claz.newInstance();
		
		System.out.println(car.getSpeed());
	}

}
