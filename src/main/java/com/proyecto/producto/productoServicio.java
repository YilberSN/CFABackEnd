package com.proyecto.producto;

import java.util.List;

public interface productoServicio {
	
	List<producto> listarProducto();
	producto listarIdProducto(int id);
	producto agregar(producto p);
	producto editar(producto p);
	producto borrar(int id);
}
