package com.ahmetselmanyildirim.helloworld.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/2")
public class MyController {

    // @PathVariable -> route'dan parametre almamızı sağlar.
    /*
        @GetMapping("/message/{m}") - @PathVariable("m") String message olarak da kullanılabilir.
         @GetMapping("/message/{message}") - @PathVariable String message olarak da kullanılabilir.
     */
    @GetMapping("/message/{message}")
    public String message(@PathVariable String message)  {
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
    public String getMyMessage(@RequestParam String message)  {
        return "Your message is: "+ message;
    }

}
