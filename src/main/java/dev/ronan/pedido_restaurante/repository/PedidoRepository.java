package dev.ronan.pedido_restaurante.repository;

import dev.ronan.pedido_restaurante.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
