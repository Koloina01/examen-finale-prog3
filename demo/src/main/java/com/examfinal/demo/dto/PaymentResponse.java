package com.examfinal.demo.dto;

import com.examfinal.demo.enums.PaymentMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PaymentResponse {

    private Integer amount;

    private LocalDate paymentDate;

    private PaymentMethod method;

    private String reference;

    private String invoiceId;

    private LocalDateTime recordedAt;

    public PaymentResponse() {
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

    public void setPaymentDate(
            LocalDate paymentDate
    ) {
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

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(
            LocalDateTime recordedAt
    ) {
        this.recordedAt = recordedAt;
    }
}
