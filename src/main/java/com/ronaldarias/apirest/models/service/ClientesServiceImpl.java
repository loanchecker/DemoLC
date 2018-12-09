package com.ronaldarias.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.ClientesDAO;
import com.ronaldarias.apirest.models.entity.Clientes;

@Service
public class ClientesServiceImpl implements CustomerService {

	// need to inject customer DAO
	@Autowired
	private ClientesDAO customerDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Clientes> getCustomers() {
		return (List<Clientes>) customerDAO.findAll();
	}

	@Override
	@Transactional
	public void saveCustomer(Clientes theCustomer) {

		customerDAO.save(theCustomer);
	}

	@Override
	@Transactional(readOnly=true)
	public Clientes getCustomer(Integer theId) {

		return customerDAO.findById(theId).get();
	}

	@Override
	@Transactional
	public void deleteCustomer(Integer theId) {

		customerDAO.deleteById(theId);
	}

}
