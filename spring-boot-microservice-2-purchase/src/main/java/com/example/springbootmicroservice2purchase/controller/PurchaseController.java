package com.example.springbootmicroservice2purchase.controller;


import com.example.springbootmicroservice2purchase.model.Purchase;
import com.example.springbootmicroservice2purchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping //api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllPurchasesOfUser(@PathVariable Long userId){
        return ResponseEntity.ok(purchaseService.findAllPurchasesOfUser(userId));
    }
}
