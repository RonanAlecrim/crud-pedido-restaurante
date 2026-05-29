package dev.ronan.pedido_restaurante.service;

import dev.ronan.pedido_restaurante.dto.request.ClienteRequestDTO;
import dev.ronan.pedido_restaurante.dto.response.ClienteResponseDTO;
import dev.ronan.pedido_restaurante.model.Cliente;
import dev.ronan.pedido_restaurante.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteResponseDTO cadastrarCliente(ClienteRequestDTO clienteDTO){

        if (clienteRepository.findByEmail(clienteDTO.email()).isPresent()) {
            throw new RuntimeException("Este e-mail já está cadastrado!");
        }

        Cliente clienteSalvo = new Cliente();
        clienteSalvo.setNome(clienteDTO.nome());
        clienteSalvo.setEmail(clienteDTO.email());
        clienteSalvo.setSenha(clienteDTO.senha());
        clienteSalvo = clienteRepository.save(clienteSalvo);

        return new ClienteResponseDTO(
                clienteSalvo.getIdCliente(),
                clienteSalvo.getNome(),
                clienteSalvo.getEmail()
        );
    }
    
    public List<ClienteResponseDTO> findAllClientes() {
        List <Cliente> clientes = clienteRepository.findAll();

        return clientes.stream()
                .map(cliente -> new ClienteResponseDTO(
                        cliente.getIdCliente(),
                        cliente.getNome(),
                        cliente.getEmail()
                ))
                .toList();
    }

    public ClienteResponseDTO clienteFindById(UUID idCliente) {
        if (clienteRepository.findById(idCliente).isPresent()) {
            Cliente cliente = clienteRepository.findById(idCliente).get();
            return new ClienteResponseDTO(cliente.getIdCliente(), cliente.getNome(), cliente.getEmail());
        }
        else {
            throw new RuntimeException("Usuário não encontrado!");
        }

    }
}
