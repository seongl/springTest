package com.apple.controller;

import com.apple.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by seonglee on 7/15/18.
 */
@Controller
@SessionAttributes("goal")
public class GoalController {
    // object is ready and passed back to jsp view

    // what if i want to store in session?
    @RequestMapping(value = "addGoal", method = RequestMethod.GET)
//    @RequestMapping(value = "addGoal")
    public String addGoal(Model model) {
        Goal goal = new Goal();

        goal.setMinutes(10);
        model.addAttribute("goal", goal);

        return "addGoal";
    }

    @RequestMapping(value = "addGoal", method = RequestMethod.POST)
    public String updateGoal(@ModelAttribute("goal") Goal goal) {
        System.out.println("Minutes updated: " + goal.getMinutes());

        return "redirect:addMinutes.html";
    }
}
