package dev.ronan.pedido_restaurante.dto.request;

import java.util.List;
import java.util.UUID;

public record PedidoRequestDTO(
        UUID clienteId,
        List<ItemPedidoRequestDTO> itens
) {
}
