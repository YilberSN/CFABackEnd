package com.proyecto.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productoServicioImp implements productoServicio{
	
	@Autowired
	private productoRepositorio repositorio;

	@Override
	public List<producto> listarProducto() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public producto listarIdProducto(int id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public producto agregar(producto p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public producto editar(producto p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public producto borrar(int id) {
		// TODO Auto-generated method stub
		producto p = repositorio.findById(id);
		if (p!=null) {
			repositorio.delete(p);
		}
		return p;
	}
	

}
