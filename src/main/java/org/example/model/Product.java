package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    int id;
    String name;
    Category category;
    double price;

    public enum Category {
        OTHER, MACHINE, SPORT
    }
}
