package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("hello")

public class HelloController {
    //private static String language;
//handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "BYEBYE, Spring!!";
    }

    //responds to /hello?name=Launchcode handles query parameters to create a gretting that is custom to the request
   // @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!!!!";
    }
// create get request handlers that accept data, dynamic handler
    // the data is part of the path, not the query string
//    responds to /hello/Launchcode

    //PV tells sb that this is handler method is looking for hello/whatevername
//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hi, " + name + "!";
//    }

    //@GetMapping("hello/{name}")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value= "hello")
    @ResponseBody
    public static String createMessage(@RequestParam String name, String language){
        String greeting;

        if ("French".equals(language)) {
            greeting = "Bonjour ";
        }else if("Italian".equals(language)){
            greeting = "Ciao ";
        }else if("German".equals(language)){
            greeting = "Hallo ";
        }else if("Spanish".equals(language)){
            greeting = "Hola ";
        }
        else{
            greeting = "Hello ";
        }
        return "<html>" +
                "<body>" +
                "<h2 style='color: red;'>" +
                greeting + name + "!" + "</h2>" +
                "</body>" +
                "</html>";
    }



//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String hello(@RequestParam String name) {
//        return "Hiya, " + name + "!";
//    }

    @GetMapping("form")
    public String helloForm(){
        return "form";
    }
//
}
