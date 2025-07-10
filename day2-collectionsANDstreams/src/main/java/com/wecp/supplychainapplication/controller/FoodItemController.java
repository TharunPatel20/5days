package com.wecp.supplychainapplication.controller;


import com.wecp.supplychainapplication.entity.FoodItem;
import com.wecp.supplychainapplication.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food-items")
public class FoodItemController {
    @Autowired
    private FoodItemService foodItemService;

    @PostMapping
    public FoodItem addFoodItem(@RequestBody FoodItem foodItem) {
        // implement this method
    }

    @GetMapping("/{itemId}")
    public FoodItem getFoodItemById(@PathVariable Long itemId) {
        // implement this method
    }

    @GetMapping
    public List<FoodItem> getAllFoodItems() {
        // implement this method
    }
}