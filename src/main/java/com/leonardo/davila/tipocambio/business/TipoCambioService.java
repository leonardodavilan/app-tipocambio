package com.leonardo.davila.tipocambio.business;


import com.leonardo.davila.tipocambio.dao.entity.TipoCambio;
import com.leonardo.davila.tipocambio.expose.dto.TipoCambioDto;

import java.util.Optional;

public interface TipoCambioService{

    TipoCambio saveTipoCambio(TipoCambio tipoCambio);

    TipoCambioDto.Response getConvertion(TipoCambioDto.Request request);
    Optional<TipoCambio> findById(Long id);
    TipoCambio findByMoneda(Long idmoneda);

}
