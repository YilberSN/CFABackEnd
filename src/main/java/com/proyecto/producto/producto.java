package com.proyecto.producto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class producto {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	@Column
	private int precio;
	@Column
	private String lugar;
	
	public int getIdprodcuto() {
		return idproducto;
	}
	public void setIdprodcuto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	@Override
	public String toString() {
		return "producto [idproducto=" + idproducto + ", precio=" + precio + ", lugar=" + lugar + "]";
	}

	
	
}
