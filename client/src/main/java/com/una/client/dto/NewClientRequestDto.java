package com.una.client.dto;

import lombok.Data;

@Data
public class NewClientRequestDto {
    private long id;
    private String firstName;
    private String email;
}