package dev.ronan.pedido_restaurante.dto.response;

import java.math.BigDecimal;

public record ItemPedidoResponseDTO(
        String nomeProduto,
        Integer quantidade,
        BigDecimal precoUnitario,
        BigDecimal subtotal //(quantidade * precoUnitario)
) {
}
