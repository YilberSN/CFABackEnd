package com.proyecto;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface ventaRepositorio extends Repository<venta, Integer>{
	
	List<venta> findAll();
	venta findById(int id);
	venta save(venta v);
	void delete(venta v);
	
}
