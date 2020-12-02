package ch.bbw.jl.crowdfunding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpendeController {

    @Autowired
    private SpendeService spendeService;

    @GetMapping("/list-spende")
    public String listBetrag(Model model) {
        model.addAttribute("listVonBetragen", spendeService.getAllBetragen());
        model.addAttribute("sum", spendeService.getSumOfAllBetragen());
        model.addAttribute("newBetrag", new Spende());
        return "list-spende";
    }

    @PostMapping("/add-betrag")
    public String addBetrag(@ModelAttribute Spende newBetrag, Model model) {
        spendeService.addBetrag(newBetrag);
        spendeService.getSumOfAllBetragen();
        model.addAttribute("listVonBetragen", spendeService.getAllBetragen());
        model.addAttribute("sum", spendeService.getSumOfAllBetragen());
        return "redirect:/list-spende";
    }

}
