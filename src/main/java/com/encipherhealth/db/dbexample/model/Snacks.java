package com.encipherhealth.db.dbexample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Snacks {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int snacksId;
    int  bookingId;
    String snacksName;
    int snacksPrice;

    public Snacks()
    {

    }

    public int getSnacksId() {
        return snacksId;
    }

    public void setSnacksId(int snacksId) {
        this.snacksId = snacksId;
    }

    public String getSnacksName() {
        return snacksName;
    }

    public void setSnacksName(String snacksName) {
        this.snacksName = snacksName;
    }

    public int getSnacksPrice() {
        return snacksPrice;
    }

    public void setSnacksPrice(int snacksPrice) {
        this.snacksPrice = snacksPrice;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
