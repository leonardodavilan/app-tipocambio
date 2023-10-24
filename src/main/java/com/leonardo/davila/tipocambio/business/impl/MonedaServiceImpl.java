package com.leonardo.davila.tipocambio.business.impl;

import com.leonardo.davila.tipocambio.business.MonedaService;
import com.leonardo.davila.tipocambio.dao.entity.Moneda;
import com.leonardo.davila.tipocambio.dao.repository.MonedaDao;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MonedaServiceImpl implements MonedaService {

	private final MonedaDao monedaDao;

	public MonedaServiceImpl(MonedaDao monedaDao) {
		this.monedaDao = monedaDao;
	}

	@Override
	public Moneda saveMoneda(Moneda moneda) {
		return monedaDao.save(moneda);
	}

	@Override
	public Optional<Moneda> getMoneda(Long idmoneda) {
		return monedaDao.findById(idmoneda);
	}
}
