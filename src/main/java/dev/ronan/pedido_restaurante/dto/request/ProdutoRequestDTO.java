package dev.ronan.pedido_restaurante.dto.request;

import java.math.BigDecimal;

public record ProdutoRequestDTO (
        String nomeProduto,
        BigDecimal precoProduto

){
}
