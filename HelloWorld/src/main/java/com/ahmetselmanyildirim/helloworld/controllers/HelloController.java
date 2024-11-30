package com.ahmetselmanyildirim.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Spring'e controller'ı tanıtmak için @RestController anotasyonunu kullanıyoruz.
public class HelloController {

    // localhost:8080/hello
    // @ GetMapping anotasyonu ile parametre olarak verilen pathe giriş yapılınca hangi fonksiyonun çalışacağını belirliyoruz.
    @GetMapping(path = "hello")
    public String sayHello() {
        return "Hello World";
    }

}
