package com.example.pushtounv;

import com.example.pushtounv.models.Customer;
import com.example.pushtounv.models.ResponseRegisterCustomer;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitService {


    @POST("api/customers/register")
    Call<ResponseRegisterCustomer> registerCustomer(@Body Customer customer);

}
