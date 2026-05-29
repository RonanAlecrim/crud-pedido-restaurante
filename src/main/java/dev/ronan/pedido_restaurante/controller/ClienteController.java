package dev.ronan.pedido_restaurante.controller;

import dev.ronan.pedido_restaurante.dto.request.ClienteRequestDTO;
import dev.ronan.pedido_restaurante.dto.response.ClienteResponseDTO;
import dev.ronan.pedido_restaurante.model.Cliente;
import dev.ronan.pedido_restaurante.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClienteResponseDTO> findAll(){
        return clienteService.findAllClientes();
    }

    @GetMapping(path = "/{idCliente}")
    @ResponseStatus(HttpStatus.OK)
    public ClienteResponseDTO findById(@PathVariable UUID idCliente){
        return clienteService.clienteFindById(idCliente);
    }
}
