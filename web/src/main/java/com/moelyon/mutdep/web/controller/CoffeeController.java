package com.moelyon.mutdep.web.controller;

import com.moelyon.common.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moelyon
 */
@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @GetMapping("")
    public Coffee getCoffee(){
        return Coffee.builder()
                .name("qaq")
                .price(223d)
                .build();
    }

    @Autowired
    private Coffee coffee;

    @GetMapping("/current")
    public Coffee getCurrentCoffee(){
        return coffee;
    }
}
