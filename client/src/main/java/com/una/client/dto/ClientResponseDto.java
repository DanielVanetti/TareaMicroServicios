package com.una.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientResponseDto {
    private String statusCode;
    private String message;
    private ClientDto client;
}
