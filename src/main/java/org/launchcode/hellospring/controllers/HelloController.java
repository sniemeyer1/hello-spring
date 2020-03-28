package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@ResponseBody
//@RequestMapping("hello")

public class HelloController {
    //private static String language;
//handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!!";
////    }

//    @ResponseBody
//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "BYEBYE, Spring!!";
//    }

    //responds to /hello?name=Launchcode handles query parameters to create a greeting that is custom to the request
    //@ResponseBody
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public static String helloWithQueryParam(@RequestParam String myname, Model model) {
        String greeting = "hiya doofus" + myname + "!";
        model.addAttribute("greetingHello", greeting);
        return "hello";
    }

     //create get request handlers that accept data, dynamic handler
     //    the data is part of the path, not the query string
     //   responds to /hello/Launchcode

     //   PV tells sb that this is handler method is looking for hello/whatevername
//        @GetMapping("{name}")
//        public String helloWithPathParam(@PathVariable String name){
//            return "Hi, " + name + "!";
//        }
//
//     @ResponseBody
//     @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value= "{name}")
//    public static String createMessage(@RequestParam String name, String language){
//        String greeting;
//        if ("French".equals(language)) {
//            greeting = "Bonjour ";
//        }else if("Italian".equals(language)){
//            greeting = "Ciao ";
//        }else if("German".equals(language)){
//            greeting = "Hallo ";
//        }else if("Spanish".equals(language)){
//            greeting = "Hola ";
//        }
//        else{
//            greeting = "Hello ";
//        }
//        return "<html>" +
//                "<body>" +
//                "<h2 style='color: red;'>" +
//                greeting + name + "!" + "</h2>" +
//                "</body>" +
//                "</html>";
//    }
    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }


    @GetMapping("theform")
    public String helloForm(){
        return "form";
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" +
//                "<input type='text' name='name'>" +
//                "<select name = 'language' id='language'>" +
//                "<option value='English'>English</option>" +
//                "<option value='Spanish'>Spanish</option>" +
//                "<option value='Italian'>Italian</option>" +
//                "<option value='French'>French</option>" +
//                "<option value='German'>German</option>" +
//                "</select>" +
//                "<input type='submit' value='Greet Me!'>" +
//               "</form>" +
//                "</h2>" +
//                "</body>" +
//                "</html>";
    }
}
