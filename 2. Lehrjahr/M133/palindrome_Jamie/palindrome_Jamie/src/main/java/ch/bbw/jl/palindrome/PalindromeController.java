package ch.bbw.jl.palindrome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PalindromeController {

    @GetMapping("/palindrome")
    public String getPalindrome(Model model) {
        model.addAttribute("palindrome", new Palindrome());
        return "palindrome";
    }

    @PostMapping("/palindrome")
    public String postPalindrome(@ModelAttribute Palindrome palindrome, Model model) {
        palindrome.check();
        model.addAttribute("palindrome", palindrome);
        return "palindrome";
    }

}
