package com.assignment2.bookApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }, scanBasePackages = {
	"com.assignment2.bookApp.repository" })
public class BookAppApplication {

    public static void main(String[] args) {
	SpringApplication.run(BookAppApplication.class, args);
    }

}
