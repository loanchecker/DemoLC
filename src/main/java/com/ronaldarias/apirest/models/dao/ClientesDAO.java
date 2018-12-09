package com.ronaldarias.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ronaldarias.apirest.models.entity.Clientes;

public interface ClientesDAO extends CrudRepository<Clientes, Integer> {

}
