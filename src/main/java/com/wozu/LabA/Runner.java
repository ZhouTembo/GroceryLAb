package com.wozu.LabA;

import com.wozu.LabA.repo.GroceryRepo;
import com.wozu.LabA.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//This page actually uses methods to add entry to table and table to repo
@Component
public class Runner implements CommandLineRunner {

//    Create instance of repo
    @Autowired
    GroceryRepo groceryRepo;

//    Create instance to add to table
    @Autowired
    GroceryService groceryService;

//adds item to table and table to repo
    @Override
    public void run(String... args) throws Exception {
        groceryService.addGrocery("Lettuce",4);
        groceryService.addGrocery("Mayo",1);
        System.out.println("Item added to grocery list");
    }
}
