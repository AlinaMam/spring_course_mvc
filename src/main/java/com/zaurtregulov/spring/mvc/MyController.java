package main.java.com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/ask-details")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    @RequestMapping("/show-details")
    public String showEmpDetails() {
        return "show-emp-details-view";
    }
}
