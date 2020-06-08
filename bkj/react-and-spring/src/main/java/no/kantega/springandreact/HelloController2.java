package no.kantega.springandreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class HelloController2 {
	@Autowired
	private TestRepository TestRepository;
	
    @RequestMapping("/test")
    public String hello12() {
    	List<Test> list = TestRepository.findAll();
    	System.out.println(123123);
        return "Hello, the time at the server is now " + new Date() + "\n" + list.get(0);
    }
}
