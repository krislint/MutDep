package com.moelyon.common.model;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class Coffee {
    private Long id;
    private String name;
    private Double price;

    public Coffee(String name) {
        this.name = name;
        System.out.println("initializing "+name);
    }

    public Coffee() {
        this("default");
    }
}

