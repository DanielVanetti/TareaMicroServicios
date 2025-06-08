package com.una.client.service.impl;

import com.una.client.dto.ClientDto;
import com.una.client.dto.ClientResponseDto;
import com.una.client.dto.NewClientRequestDto;
import com.una.client.entity.Client;
import com.una.client.exception.ClientNotFoundException;
import com.una.client.repository.ClientRepository;
import com.una.client.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {
    private ClientRepository clientRepository;

    @Override
    public void createClient(NewClientRequestDto newClientRequestDto) {
        Client client = new Client();
        client.setId(newClientRequestDto.getId());
        client.setFirstName(newClientRequestDto.getFirstName());
        client.setEmail(newClientRequestDto.getEmail());
        clientRepository.save(client);
    }

    @Override
    public ClientResponseDto getClient(long id) {
        Optional<Client> clientOptional = clientRepository.findById(id);
        if (clientOptional.isEmpty()) {
            throw new ClientNotFoundException("Client doesn't exist");
        }
        Client client = clientOptional.get();
        ClientDto clientDto = new ClientDto(client.getId(), client.getFirstName(), client.getEmail());
        return new ClientResponseDto("200", "Success", clientDto);
    }
}

