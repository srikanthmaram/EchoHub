package com.sri.EchoHub;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/{path:[^\\.]*}") // Matches paths without a period (e.g., `/home`, `/dashboard`)
    public String forwardToIndex() {
        return "forward:/index.html";
    }
}
