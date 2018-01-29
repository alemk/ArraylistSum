package com.example.arraylistadder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @RequestMapping("/")
    public String sumcaller()
    {
        Numberadder numadd = new Numberadder();
        return numadd.adder();
    }
}

