package com.proyecto;

import java.util.List;

public interface ventaServicio {
	
	List<venta> listar();
	venta listarId(int id);
	venta agregar(venta v);
	venta editar(venta v);
	venta borrar(int id);

}
