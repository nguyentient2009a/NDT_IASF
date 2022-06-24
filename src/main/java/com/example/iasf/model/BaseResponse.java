package com.example.iasf.model;

public class BaseResponse<T> {
    public int status = 1 ;
    public String message = "Success";
    public T data;
}
