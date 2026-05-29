package dev.ronan.pedido_restaurante.dto.request;

import java.util.UUID;

public record ClienteRequestDTO(
        String nome,
        String email,
        String senha
) {
}
