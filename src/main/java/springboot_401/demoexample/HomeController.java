package springboot_401.demoexample;

import org.springframework.web.bind.annotation.RequestMapping;


public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";

    }
}
