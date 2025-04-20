package com.unicesumar.entities;

import com.unicesumar.paymentMethods.PaymentMethod;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Sales {
    private UUID id;
    private User buyer;
    private List<Product> products;
    private double totalValue;
    private PaymentMethod paymentMethod;
    private String authCode;
    private LocalDateTime saleDate;

    //----Construtor----
    public Sales(UUID id, User buyer, List<Product> products, double totalValue,
                 PaymentMethod paymentMethod, String authCode, LocalDateTime saleDate) {
        this.id = id;
        this.buyer = buyer;
        this.products = products;
        this.totalValue = totalValue;
        this.paymentMethod = paymentMethod;
        this.authCode = authCode;
        this.saleDate = saleDate;
    }

    //----Getters----
    public UUID getId() {
        return id;
    }

    public User getBuyer() {
        return buyer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getAuthCode() {
        return authCode;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }
}
