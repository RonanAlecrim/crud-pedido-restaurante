package dev.ronan.pedido_restaurante.dto.request;

public record ItemPedidoRequestDTO(
        Long produtoId,
        Integer quantidade
) {
}
