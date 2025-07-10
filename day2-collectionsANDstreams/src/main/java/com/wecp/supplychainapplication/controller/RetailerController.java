package com.wecp.supplychainapplication.controller;

import com.wecp.supplychainapplication.entity.Retailer;
import com.wecp.supplychainapplication.service.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/retailers")
public class RetailerController {
    @Autowired
    private RetailerService retailerService;

    @PostMapping
    public Retailer addRetailer(@RequestBody Retailer retailer) {
        // implement this method
    }

    @GetMapping("/{retailerId}")
    public Retailer getRetailerById(@PathVariable Long retailerId) {
        // implement this method
    }

    @GetMapping
    public List<Retailer> getAllRetailers() {
        // implement this method

    }
}