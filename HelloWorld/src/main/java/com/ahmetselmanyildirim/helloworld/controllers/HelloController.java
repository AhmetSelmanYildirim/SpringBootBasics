package com.ahmetselmanyildirim.helloworld.controllers;

import org.springframework.web.bind.annotation.*;

// Spring'e controller'ı tanıtmak için @RestController anotasyonunu kullanıyoruz.
@RestController
// Class seviyesinde @RequestMapping endpointlerin başındaki ilk seviye pathi belirler. /api/hello
@RequestMapping(path="/api")
public class HelloController {

    // localhost:8080/api/hello

    // Method seviyesinde @RequestMapping @GetMapping, @PostMapping gibi anotasyonların daha genel halidir.
    // @GetMapping anotasyonunu kullanmak daha sade bir görünüm sunar.
    //@RequestMapping(path = "/hello",method = RequestMethod.GET)

    // @ GetMapping anotasyonu ile parametre olarak verilen pathe giriş yapılınca hangi fonksiyonun çalışacağını belirliyoruz.
    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello World";
    }

    @PostMapping("/save")
    public String save(){
        return "Data saved";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted";
    }

    @PutMapping("/update")
    public String update(){
        return "Data updated";
    }

}
