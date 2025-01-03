package com.ahmetselmanyildirim.helloworld.controllers;

import com.ahmetselmanyildirim.helloworld.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/2")
public class MyController {

    // @PathVariable -> route'dan parametre almamızı sağlar.
    /*
        @GetMapping("/message/{m}") - @PathVariable("m") String message olarak da kullanılabilir.
         @GetMapping("/message/{message}") - @PathVariable String message olarak da kullanılabilir.
     */
    /*
        required -> @PathVariable'da false verildiğinde param'ı almadığında 404 hatası dönmez.
                    Ama bunun için route'un parametresiz halini de @GetMapping'de tanımlamak gerekir.
    */
    @GetMapping({"/message", "/message/{message}"})
    public String message(@PathVariable(name = "message", required = false) String message)  {
        return "Your message is: "+ message;
    }

    // @RequestParam -> parametreden veri alınmasını sağlar
    /*
         @RequestParam String message
            -> bu şekil kullanımda route'da api/2/getmessage?message=selam şeklinde parametrenin belirtilmesi gerekir
         @RequestParam("m") String message
            -> şeklinde parametre verilerek de kullanılabilir bu durumda route api/2/getmessage?m=selam şeklinde olacaktır.
    */

    @GetMapping("/getmessage")
    public String getMyMessage(@RequestParam(name = "message", required = false, defaultValue = "default message") String message)  {
        return "Your message is: "+ message;
    }

    // @RequestBody -> Kullanıcıdan object şeklinde veri alabildiğimiz bir anotasyon.
    /*
        User sınıfını destekleyecek bir JSON nesnesi ister
    */
    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }
    @PostMapping("/users")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("User saved!");
        users.forEach((u)->u.setPassword(""));
        return users;
    }

    // @RequestHeader -> Header'dan veri alınmasını sağlar
    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String header){
        return "Your header is: "+ header;
    }


}
