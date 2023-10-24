package com.leonardo.davila.tipocambio.business;

import com.leonardo.davila.tipocambio.dao.entity.Moneda;

import java.util.Optional;

public interface MonedaService {

    Moneda saveMoneda(Moneda moneda);
    Optional<Moneda> getMoneda(Long idmoneda);
}
