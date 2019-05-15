package com.geekbrains.controllers;


import com.geekbrains.entites.Human;
import com.geekbrains.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/")
public class MainController {
    private int calculate;
    private HumanService humanService;

    @Autowired
    public void setHumanService(HumanService humanService) {
        this.humanService = humanService;
    }

    @RequestMapping(path = "/calculate/{sid}/{sid1}", method = RequestMethod.GET)
    @ResponseBody
    public int calculate(@PathVariable("sid") int id, @PathVariable("sid1") int id1) {
        calculate = id + id1;
        return calculate;
    }

    @RequestMapping(path = "/setHuman", method = POST)
    public void setHuman(@RequestBody Human human) {
        System.out.println(human.getFirstName() + " " + human.getLastName());
    }

    @RequestMapping("/list-form")
    @ResponseBody
    public ArrayList<Human> list(Model uiModel, @ModelAttribute("humans") ArrayList<Human> humans){
        humans = humanService.getAll();
        uiModel.addAttribute("humans", humans);
        return humans;
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Human human = new Human();
        uiModel.addAttribute("human", human);
        return "human-form";

    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("human") Human human) {
        return "human-form-result";
    }

}
