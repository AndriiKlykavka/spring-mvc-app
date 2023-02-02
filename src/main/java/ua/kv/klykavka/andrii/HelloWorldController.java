package ua.kv.klykavka.andrii;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.HttpServletBean;


@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

//    @RequestMapping("/processFormV2")
//    public String nameToUppercase(ServletWebRequest request, Model model) {
//
//        String name = request.getParameter("studentName");
//        name = name.toUpperCase();
//        name = "YO! " + name;
//        model.addAttribute("name", name);
//        return "helloworld";
//    }
    @RequestMapping("/processFormV2")
    public String nameToUppercase(
            @RequestParam("studentName") String name, Model model) {
        name = name.toUpperCase();
        model.addAttribute("message", name);
        return "helloworld";
    }
}
