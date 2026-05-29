package dev.ronan.pedido_restaurante.controller;

import dev.ronan.pedido_restaurante.dto.request.ClienteRequestDTO;
import dev.ronan.pedido_restaurante.dto.response.ClienteResponseDTO;
import dev.ronan.pedido_restaurante.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponseDTO save(@RequestBody ClienteRequestDTO cliente){
        return clienteService.cadastrarCliente(cliente);
    }
}
