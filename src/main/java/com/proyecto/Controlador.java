package com.proyecto;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.producto.producto;
import com.proyecto.producto.productoServicio;

//Agregamos la dirección donde esta el frontend
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/venta"})
public class Controlador {
	
	//Acciones a realizar desde el repositorio (base de datos)
	@Autowired
    ventaServicio servicio;
	@Autowired
    productoServicio servicioProducto;
    
	//Metodo get para devolver la lista de las ventas realizadas
    @GetMapping
    public List<venta>listar(){
        return servicio.listar();
    }
    
    //Metodo post para agregar una ventas (Utilizado a modo de desarrollo para validar funcionamiento de la base de datos)
    @PostMapping
    public venta agregar(@RequestBody venta v) {
    	return servicio.agregar(v);
    }
    
    //Metodo get para obtener una venta en particular para realizar actualizaciones o modificaciones
    @GetMapping(path= {"/{idventa}"})
    public venta listarId(@PathVariable("idventa") int idventa) {
    	return servicio.listarId(idventa);
    }
    
    //Metodo put para actualizar o modificar una venta
    @PutMapping(path = {"/{idventa}"})
    public venta editar(@RequestBody venta v, @PathVariable("idventa") int idventa) {
    	v.setIdventa(idventa);
    	return servicio.editar(v);
    }
    
    //Metodo delete para borrar un venta
    @DeleteMapping(path = {"/{idventa}"})
    public venta borrar(@PathVariable("idventa") int idventa) {
    	return servicio.borrar(idventa);
    }
    
    //Metodo get para buscar un producto y obtener sus datos (Utilizado a modo de desarrollo para validar el contenido de la base de datos)
    @GetMapping(path= {"/producto/{idproducto}"})
    public producto listarIdProducto(@PathVariable("idproducto") int idproducto) {
    	return servicioProducto.listarIdProducto(idproducto);
    }
    
    //Metodo post para agregar una ventas (Utilizado a modo de desarrollo para añadir productos a la base de datos)
    @PostMapping(path= {"/producto"})
    public producto agregarProducto(@RequestBody producto p) {
    	return servicioProducto.agregar(p);
    }
    
    //Metodo put para actualizar o modificar una producto (Utilizado a modo de desarrollo para actualizar o modificar prodcutos)
    @PutMapping(path = {"/producto/{idproducto}"})
    public producto editarProducto(@RequestBody producto p, @PathVariable("idproducto") int idproducto) {
    	p.setIdprodcuto(idproducto);
    	return servicioProducto.editar(p);
    }
    
    //Metodo delete para borrar un venta (Utilizado a modo de desarrollo para actualizar o modificar prodcutos)
    @DeleteMapping(path = {"/producto/{idproducto}"})
    public producto borrarProducto(@PathVariable("idproducto") int idproducto) {
    	return servicioProducto.borrar(idproducto);
    }
    
    //Metodo post para agregar una venta
    //Aqui se valida los datos de entrada desde el frontend se busca el producto a comprar en una tabla en la base de datos
    //se valida que exista el producto y se extrae el costo individual y el lugar de despacho con el fin de devolver
    //el mensaje y guardar como una nueva venta esta transaccion realizada
    @PostMapping(path= {"/preventa"})
    public HashMap<String, Object> agregar(@RequestBody datosentrada datos) {
    	HashMap<String, Object> map = new HashMap<>(); //Se crea un JSON para devolver el mensaje
    	producto producto_preventa=servicioProducto.listarIdProducto(datos.getIdproducto()); //Se busca el producto por el id de los datos de entrada
    	int calcular_total=0; //Se crea una variable para tener el calculo total de la compra
    	if(producto_preventa!=null) {// Se valida si el producto existe y se puede realizar la venta
    		
    		// Se calcula el valor de la compra
    		calcular_total=datos.getCantidad()*producto_preventa.getPrecio();
    		
    		//Se modela la venta con un nuevo objeto y se le asigna los datos a guardar
    		venta nueva_venta = new venta(); 
    		nueva_venta.setCantidadproducto(datos.getCantidad());
    		nueva_venta.setIdproducto(datos.getIdproducto());
    		nueva_venta.setLugardespacho(producto_preventa.getLugar());
    		nueva_venta.setValorventa(calcular_total);
    		
    		//Se agrega una nueva venta a la base de datos
    		servicio.agregar(nueva_venta);
    		
    		//Se construye el mensaje a mostrar de la venta realizada correctamente
    		map.put("mensaje", "Venta realizada!\nId de la factura: "+nueva_venta.getIdventa()
    				+"\nValor individual: $"+nueva_venta.getValorventa()
    				+"\nCantidad: "+datos.getCantidad()
    				+"\nValor descontado: $"+nueva_venta.getValorventa()
    				+"\nLugar de despacho: "+nueva_venta.getLugardespacho());
    		return map;
    	}else {
    		//Se construye el mensaje para mostrar que No se pudo realizar la venta
    		map.put("mensaje", "Venta no realizada debido a que NO esta disponible el producto para el despacho");
    		return map;
    	}
    	
    }
    
}
