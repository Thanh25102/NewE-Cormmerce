package com.buimanhthanh.model;

import com.buimanhthanh.enums.Status;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class Response<T>{
    private Status status;
    private String message;
    private String localDate;
    private T data;

    public Response(Status status,String message, T data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        localDate = LocalDate.now().format(formatter);
        this.status = status;
        this.message = message;
        this.data = data;
    }

}
