package com.example.pushtounv.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseRegisterCustomer {

    @SerializedName("Customer")
    @Expose
    private Customer customer;
    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}