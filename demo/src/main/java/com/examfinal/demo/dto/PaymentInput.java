package com.examfinal.demo.dto;

import com.examfinal.demo.enums.PaymentMethod;

import java.time.LocalDate;

public class PaymentInput {

    private Integer amount;

    private LocalDate paymentDate;

    private PaymentMethod method;

    private String reference;

    public PaymentInput() {
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}