package com.leonardo.davila.tipocambio.dao.repository;

import com.leonardo.davila.tipocambio.dao.entity.TipoCambio;
import org.springframework.data.repository.CrudRepository;

public interface TipoCambioDao extends CrudRepository<TipoCambio, Long> {

    TipoCambio findTipoCambioByMoneda_Idmoneda(Long idmoneda);
}
