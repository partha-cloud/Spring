package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/hello", ""})
public class HelloWorldController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From Bridgelabz";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }
    @GetMapping("/param/{name}")
    public String showHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz.";
    }

    @PostMapping("/post")
    public String showHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz.";
    }

    @PutMapping("/put/{firstName}")
    public String showHelloByPut(@PathVariable String firstName, @RequestParam(value="lastName") String lastName) {
        return "Welcome "+firstName+" "+lastName+" from BridgeLabz.";
    }
}


