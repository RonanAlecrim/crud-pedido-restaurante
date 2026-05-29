package dev.ronan.pedido_restaurante.dto.response;

import java.math.BigDecimal;

public record ProdutoResponseDTO(
        Long idProduto,
        String nomeProduto,
        BigDecimal precoProduto
) {
}
