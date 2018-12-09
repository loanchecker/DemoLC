package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.Prestamos;

public interface PrestamosService {
	
	public List<Prestamos> getPrestamos();

	public void savePrestamo(Prestamos thePrestamo);

	public Prestamos getPrestamo(Integer theId);

	public void deletePrestamo(Integer theId);

}
