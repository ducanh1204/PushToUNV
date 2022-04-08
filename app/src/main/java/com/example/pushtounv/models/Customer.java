package com.example.pushtounv.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer {

@SerializedName("IdNumber")
@Expose
private String idNumber;
@SerializedName("FullName")
@Expose
private String fullName;
@SerializedName("Image")
@Expose
private String image;

public String getIdNumber() {
return idNumber;
}

public void setIdNumber(String idNumber) {
this.idNumber = idNumber;
}

public String getFullName() {
return fullName;
}

public void setFullName(String fullName) {
this.fullName = fullName;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

}