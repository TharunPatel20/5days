package com.wecp.supplychainapplication.service;


import com.wecp.supplychainapplication.entity.FoodItem;
import com.wecp.supplychainapplication.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    private FoodItemRepository foodItemRepository;

    public FoodItem addFoodItem(FoodItem foodItem) {
        // complete this method
    }

    public FoodItem getFoodItemById(Long itemId) {
        // complete this method
    }

    public List<FoodItem> getAllFoodItems() {
        // complete this method
    }
}