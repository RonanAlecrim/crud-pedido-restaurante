package dev.ronan.pedido_restaurante.dto.response;

import java.util.UUID;

public record ClienteResponseDTO(
        UUID clienteId,
        String nome,
        String email
) {
}
