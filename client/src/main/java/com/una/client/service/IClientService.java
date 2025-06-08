package com.una.client.service;

import com.una.client.dto.ClientDto;
import com.una.client.dto.ClientResponseDto;
import com.una.client.dto.NewClientRequestDto;

public interface IClientService {
    void createClient(NewClientRequestDto newClientRequestDto);

    ClientResponseDto getClient(long id);
}
