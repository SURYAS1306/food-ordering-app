package com.foodapp.foodorderingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
public class FoodOrderingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodOrderingAppApplication.class, args);
        System.out.println("✅ Food Ordering App started (DB DISABLED - DEMO MODE)");
    }
}
