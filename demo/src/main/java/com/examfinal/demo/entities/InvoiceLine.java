package com.examfinal.demo.entities;

public class InvoiceLine {

    private Consultant consultant;

    private Double daysBilled;

    private Integer dailyRate;

    private Integer subtotal;

    public InvoiceLine() {
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }

    public Double getDaysBilled() {
        return daysBilled;
    }

    public void setDaysBilled(Double daysBilled) {
        this.daysBilled = daysBilled;
    }

    public Integer getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Integer dailyRate) {
        this.dailyRate = dailyRate;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }
}
