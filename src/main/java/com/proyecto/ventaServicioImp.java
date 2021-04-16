package com.proyecto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ventaServicioImp implements ventaServicio{
	
	@Autowired
	private ventaRepositorio repositorio;
	
	@Override
	public List<venta> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public venta listarId(int id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public venta agregar(venta v) {
		// TODO Auto-generated method stub
		return repositorio.save(v);
	}

	@Override
	public venta editar(venta v) {
		// TODO Auto-generated method stub
		return repositorio.save(v);
	}

	@Override
	public venta borrar(int id) {
		// TODO Auto-generated method stub
		venta v = repositorio.findById(id);
		if (v!=null) {
			repositorio.delete(v);
		}
		return v;
	}
	
	
	
}
