package dev.ronan.pedido_restaurante.repository;

import dev.ronan.pedido_restaurante.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    Optional<Cliente> findById(UUID id);
    Optional<Cliente> findByNome(String nome);
    Optional<Cliente> findByEmail(String email);
}
