package dev.ronan.pedido_restaurante.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record PedidoResponseDTO(
        Long idPedido,
        String nomeCliente,

        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime dataPedido,

        List<ItemPedidoResponseDTO> itens,
        BigDecimal valorTotal

) {
}
