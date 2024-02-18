package com.hazem.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public void addClient(Client client) {
        clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
