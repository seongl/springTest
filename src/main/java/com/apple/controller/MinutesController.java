package com.apple.controller;

import com.apple.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by seonglee on 7/15/18.
 */

@Controller
public class MinutesController {

    @RequestMapping(value = "addMinutes")
    // ModelAttribute is binded to form commandName
    public String addMinutes(@ModelAttribute ("exercise") Exercise exercise ) {
        System.out.println("exercise: " + exercise.getMinutes());
        return "addMinutes";
    }

//    @RequestMapping(value = "addMinutes")
//    // ModelAttribute is binded to form commandName
//    public String addMinutes(@ModelAttribute ("exercise") Exercise exercise ) {
//        System.out.println("exercise: " + exercise.getMinutes());
//        return "forward:addMoreMinutes.html"; // going outside of framework and coming back
//    }

//    @RequestMapping(value = "addMinutes")
//    // ModelAttribute is binded to form commandName
//    public String addMinutes(@ModelAttribute ("exercise") Exercise exercise ) {
//        System.out.println("exercise: " + exercise.getMinutes());
//        return "redirect:addMoreMinutes.html"; // closed our request and created a new request, therefore lost info
//        // useful for checkout - back button and credit card get charged twice etc
//    }
//
//    @RequestMapping(value = "addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise ) {
//        System.out.println("exercising: " + exercise.getMinutes());
//        return "addMinutes";
//    }

}
