package com.wecp.supplychainapplication.service;


import com.wecp.supplychainapplication.entity.Retailer;
import com.wecp.supplychainapplication.repository.RetailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class RetailerService {
    @Autowired
    private RetailerRepository retailerRepository;

    public Retailer addRetailer(Retailer retailer) {
       // implement this method
    }

    public Retailer getRetailerById(Long retailerId) {
        // implement this method
    }

    public List<Retailer> getAllRetailers() {
        // implement this method
    }
}
