package ch.bbw.jl.validation.controller;
import ch.bbw.jl.validation.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * PersonController
 *
 * @author Jamie Lam
 * @version 02.06.2019
 */
@Controller
public class PersonController {
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("newPerson", new Person());
        return "personform";
    }
    @PostMapping("/")
    public String checkPersonInfo(@ModelAttribute("newPerson") @Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("problems" + bindingResult.getErrorCount());
            return "personform";
        }
        System.out.println("PersonController:checkPersonInfo(): "
                + person.toString());
        return "redirect:/";
    }
}