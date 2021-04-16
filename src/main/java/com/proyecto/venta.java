package com.proyecto;

import javax.persistence.*;

@Entity
@Table(name="venta")
public class venta {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idventa;
	@Column
	private int valorventa;
	@Column
	private int idproducto;
	@Column
	private int cantidadproducto;
	@Column
	private String lugardespacho;
	
	
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getValorventa() {
		return valorventa;
	}
	public void setValorventa(int valorventa) {
		this.valorventa = valorventa;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getCantidadproducto() {
		return cantidadproducto;
	}
	public void setCantidadproducto(int cantidadproducto) {
		this.cantidadproducto = cantidadproducto;
	}
	public String getLugardespacho() {
		return lugardespacho;
	}
	public void setLugardespacho(String lugardespacho) {
		this.lugardespacho = lugardespacho;
	}
	
	
	
	
}
