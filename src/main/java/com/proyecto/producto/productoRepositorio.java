package com.proyecto.producto;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface productoRepositorio extends Repository<producto, Integer>{
	
	List<producto> findAll();
	producto findById(int id);
	producto save(producto p);
	void delete(producto p);
}
