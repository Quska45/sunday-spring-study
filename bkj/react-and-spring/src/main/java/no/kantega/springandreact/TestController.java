package no.kantega.springandreact;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private TestInterface testRepository;
	
	@RequestMapping("/test")
	public List test2() {
		System.out.println("aaa");
		List<Test> list = testRepository.findAll();
		return list;
	}
}
