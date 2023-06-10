package com.example.myspringdata;

import com.example.myspringdata.entity.Kitab;
import com.example.myspringdata.entity.Yazici;
import com.example.myspringdata.repository.KitabRepo;
import com.example.myspringdata.repository.YaziciRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MyspringdataApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyspringdataApplication.class, args);
    }

}
