package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.Clientes;

public interface CustomerService {
	
	public List<Clientes> getCustomers();

	public void saveCustomer(Clientes theCustomer);

	public Clientes getCustomer(Integer theId);

	public void deleteCustomer(Integer theId);

}
