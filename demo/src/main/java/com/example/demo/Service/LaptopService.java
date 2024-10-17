package com.example.demo.Service;

import com.example.demo.Model.Laptop;
import com.example.demo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void add(Laptop laptop) {
        repo.save(laptop);

    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }

}