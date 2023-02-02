package ua.kv.klykavka.andrii;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class SillyController {
    @RequestMapping("/showForm")
    public String   displayForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processFormV2")
    public String nameToUppercase(
            @RequestParam("studentName") String name, Model model) {
        name = name.toUpperCase();
        model.addAttribute("message", name);
        return "helloworld";
    }
}
