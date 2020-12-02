package ch.bbw.jl.goodbyemoon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {
    @RequestMapping("/goodbye")
    public String sayGoodbye() {
        return "Goodbye World!";
    }
}
