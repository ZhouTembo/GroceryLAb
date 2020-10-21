package com.wozu.LabA.service;

import com.wozu.LabA.model.Grocery;
import com.wozu.LabA.repo.GroceryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryService {

    @Autowired
    GroceryRepo groceryRepo;

//    adds groceries to table
    public void addGrocery(String name, int qty){
        groceryRepo.save(new Grocery(name,qty));

    }

//    Lists all groceries
    public List<Grocery> getGroceryList(){
        return groceryRepo.findAll();
    }
}
