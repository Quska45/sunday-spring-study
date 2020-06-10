package no.kantega.springandreact;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/api/hello")
    public String hello() {
        return "Hello,12321 the time at the server is now " + new Date() + "\n";
    }
}
