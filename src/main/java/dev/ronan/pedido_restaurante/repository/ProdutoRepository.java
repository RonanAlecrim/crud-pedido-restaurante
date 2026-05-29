package dev.ronan.pedido_restaurante.repository;

import dev.ronan.pedido_restaurante.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
