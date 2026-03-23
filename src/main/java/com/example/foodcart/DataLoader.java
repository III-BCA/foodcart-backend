package com.example.foodcart;

import com.example.foodcart.model.Menu;
import com.example.foodcart.repository.MenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(MenuRepository repo) {
        return args -> {
            repo.save(new Menu(null, "Burger", 120, "Fast Food"));
            repo.save(new Menu(null, "Pizza", 250, "Fast Food"));
            repo.save(new Menu(null, "Sandwich", 80, "Snacks"));
        };
    }
}