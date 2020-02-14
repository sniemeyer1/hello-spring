package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("hello")

public class HelloController {
    private static String language;

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!!";
//    }

//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "BYEBYE, Spring!!";
//    }

    //responds to /hello?name=Launchcode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name){
        return "Hello, " + name + "!!!!";
    }
    // responds to /hello/Launchcode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name){
        return "Hi, " + name + "!";
    }

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public static String createMessage(@RequestParam String name, String language){
//        String englishGreeting = "Hello ";
//        String italianGreeting = "Ciao ";
//        String frenchGreeting = "Bonjour ";
//        String germanGreeting = "Hallo ";
//        String spanishGreeting = "Hola ";
//
//        switch (language) {
//            case "French":
//                return frenchGreeting + name + "!";
//            case "Spanish":
//                return spanishGreeting + name + "!";
//            case "German":
//                return germanGreeting + name + "!";
//            case "Italian":
//                return italianGreeting + name + "!";
//            default:
//                return englishGreeting + name + "!";
//        }
//
//    }



//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String hello(@RequestParam String name) {
//        return "Hiya, " + name + "!";
//    }

    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

}
