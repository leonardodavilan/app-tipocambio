package com.leonardo.davila.tipocambio.dao.repository;

import com.leonardo.davila.tipocambio.dao.entity.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonedaDao extends JpaRepository<Moneda, Long> {

}
