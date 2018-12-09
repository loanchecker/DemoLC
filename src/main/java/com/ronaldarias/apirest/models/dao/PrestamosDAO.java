package com.ronaldarias.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ronaldarias.apirest.models.entity.Prestamos;

public interface PrestamosDAO extends CrudRepository<Prestamos, Integer> {

}
