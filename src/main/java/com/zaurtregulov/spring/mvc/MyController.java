package com.zaurtregulov.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
   /* @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }*/

    @RequestMapping("/ask-details")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

   /* @RequestMapping("/show-details")
    public String showEmpDetails() {
        return "WEB-INF/view/show-emp-details-view.jsp";
    }*/

   /* @RequestMapping("/show-details")
    public String showEmpDetails(HttpServletRequest request, Model model) {
        String employeeName = request.getParameter("employeeName");
        employeeName = "Ms. " + employeeName;
        model.addAttribute("nameAttribute", employeeName);
        model.addAttribute("description", "junior java developer");
        return "WEB-INF/view/show-emp-details-view.jsp";
    }*/

    @RequestMapping("/show-details")
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Ms. " + empName + "!";
        model.addAttribute("nameAttribute", empName);
        return "show-emp-details-view";
    }
}
