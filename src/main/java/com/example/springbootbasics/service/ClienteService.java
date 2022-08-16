package com.example.springbootbasics.service;

import com.example.springbootbasics.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public String persistirRepository(){
        return this.clienteRepository.persistir();
    }
}
