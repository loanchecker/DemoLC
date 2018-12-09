package com.ronaldarias.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.PrestamosDAO;
import com.ronaldarias.apirest.models.entity.Prestamos;

@Service
public class PrestamosServiceImpl {
	
	//need to inject customer DAO
	@Autowired
	private PrestamosDAO prestamoDAO;
	
	//@Override
	@Transactional(readOnly=true)
	public List<Prestamos> getPrestamos(){
		return (List<Prestamos>) prestamoDAO.findAll();
	}
	
	//@Override
	@Transactional
	public void savePrestamo(Prestamos prestamo) {
		
		prestamoDAO.save(prestamo);
	}
	
	//@Override
	@Transactional(readOnly=true)
	public Prestamos getPrestamo(Integer id) {
		
		return prestamoDAO.findById(id).get();
	}
	
	//@Override
	@Transactional
	public void deletePrestamo(Integer id) {
		
		prestamoDAO.deleteById(id);
	}
	
}
