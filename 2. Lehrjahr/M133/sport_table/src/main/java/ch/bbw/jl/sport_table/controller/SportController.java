package ch.bbw.jl.sport_table.controller;

import ch.bbw.jl.sport_table.entity.Sport;
import ch.bbw.jl.sport_table.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SportController {

    @Autowired
    private SportService sportService;

    @GetMapping("/list-sports")
    public String listSports(Model model) {
        model.addAttribute("listOfSports", sportService.getAllSports());
        model.addAttribute("newSports", new Sport());
        return "list-sports";
    }

    @PostMapping("/add-sport")
    public String addSport(@ModelAttribute Sport newSports, Model model) {
        sportService.addSport(newSports);
        model.addAttribute("listOfSports", sportService.getAllSports());
        return "redirect:/list-sports";
    }

    @GetMapping("/delete-sport")
    public String deleteSport(Model model) {
        if ((sportService.getAllSports() != null)) {
            sportService.getAllSports().remove(sportService.getAllSports().size()-1);
        }
        model.addAttribute("listOfSports", sportService.getAllSports());
        return "redirect:/list-sports";
    }

}
