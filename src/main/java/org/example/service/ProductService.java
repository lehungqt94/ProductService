package org.example.service;

import org.example.entity.Category;
import org.example.entity.Product;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class ProductService {

    private List<Product> products;

    @PostConstruct
    public void initdata() {
        products = new ArrayList<>();
        products.add(new Product(1, "O Mo", Category.OTHER, 10.5));
        products.add(new Product(2, "DishWasher", Category.MACHINE, 1000.5));
        products.add(new Product(3, "Hoover", Category.MACHINE, 250.5));
        products.add(new Product(4, "Ball", Category.SPORT, 7.5));
    }

    public List<Product> getProducts() {
        return products;
    }

    public Optional<Product> getProduct(int id) {
        return products
                .stream()
                .filter(isValid(id)).findFirst();
    }

    Predicate<Product> isValid(int id) {
        return product -> id == product.getId();
    }
}
