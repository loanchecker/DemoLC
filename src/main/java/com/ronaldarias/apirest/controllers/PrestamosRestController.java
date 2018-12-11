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

import com.ronaldarias.apirest.models.entity.Prestamos;
import com.ronaldarias.apirest.models.service.PrestamosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PrestamosRestController {
	
	//injection dependency
	@Autowired
	private PrestamosService prestamoService;
	
	@GetMapping("/prestamos")
	public List<Prestamos> getPrestamos(){
		return prestamoService.getPrestamos();
	}
	
	@GetMapping("/prestamos/{id}")
	public Prestamos getPrestamo(@PathVariable int id) {
		
		Prestamos prestamo = prestamoService.getPrestamo(id);
		
		return prestamo;
	}
	
	// add mapping for POST /customers - add new customer

	@PostMapping("/prestamos")
	@ResponseStatus(HttpStatus.CREATED)
	public Prestamos addPrstamo(@RequestBody Prestamos prestamo) {
		
		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		prestamo.setId(null);

		prestamoService.savePrestamo(prestamo);

		return prestamo;
	}
	
	// add mapping for PUT /customers - update existing customer
	
	@PutMapping("/prestamos")
	@ResponseStatus(HttpStatus.CREATED)
	public Prestamos updateCustomer(@RequestBody Prestamos prestamo) {
		
		prestamoService.savePrestamo(prestamo);
		
		return prestamo;
	}
	
	
	//add mapping for DELETE /customers/{customerId} - delete existing customer
	@DeleteMapping("/prestamos/{prestamoId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePrestamo(@PathVariable int prestamoId) {
		
		prestamoService.deletePrestamo(prestamoId);
	}
	
}
