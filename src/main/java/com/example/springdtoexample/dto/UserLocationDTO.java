package com.example.springdtoexample.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private long userId;
    private String email;
    private String place;
}