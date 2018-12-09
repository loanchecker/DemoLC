package com.ronaldarias.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldarias.apirest.models.entity.Clientes;
import com.ronaldarias.apirest.models.service.CustomerService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CustomerRestController {

	// injection dependency
	@Autowired
	private CustomerService customerService;

	@GetMapping("/clientes")
	public List<Clientes> getCustomers() {
		return customerService.getCustomers();
	}

	@GetMapping("/clientes/{Id}")
	public Clientes getCustomer(@PathVariable int Id) {

		Clientes customer = customerService.getCustomer(Id);

		return customer;
	}

	// add mapping for POST /customers - add new customer

	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes addCustomer(@RequestBody Clientes customer) {

		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		customer.setId(null);

		customerService.saveCustomer(customer);

		return customer;
	}
	
	// add mapping for PUT /customers - update existing customer
	
	@PutMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes updateCustomer(@RequestBody Clientes customer) {
		
		customerService.saveCustomer(customer);
		
		return customer;
	}
	
	
	//add mapping for DELETE /customers/{customerId} - delete existing customer
	@DeleteMapping("/clientes/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable int customerId) {
		
		customerService.deleteCustomer(customerId);
	}

}