package com.wozu.LabA.repo;

import com.wozu.LabA.model.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;

//This page creates repo class where we can save our tables and data
// and is allowing us to use repository methods such as find all and other CRUD methods
public interface GroceryRepo extends JpaRepository<Grocery,Integer> {
}
