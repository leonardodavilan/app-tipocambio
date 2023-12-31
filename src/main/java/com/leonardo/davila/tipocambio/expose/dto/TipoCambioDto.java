package com.leonardo.davila.tipocambio.expose.dto;

import com.leonardo.davila.tipocambio.dao.entity.Moneda;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class TipoCambioDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Request implements Serializable {
        private BigDecimal monto;
        private Moneda monedaOrigen;
        private Moneda monedaDestino;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Response implements Serializable {
        private BigDecimal monto;
        private BigDecimal conversion;
        private String monedaOrigen;
        private String monedaDestino;
        private BigDecimal tipoCambio;
    }

}
