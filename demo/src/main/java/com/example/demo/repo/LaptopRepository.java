package com.example.demo.repo;

import com.example.demo.Model.Laptop;
import org.springframework.stereotype.Repository;



@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in Database..");
    }
}