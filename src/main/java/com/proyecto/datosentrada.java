package com.proyecto;

public class datosentrada {
	private int idproducto;
	private int cantidad;
	private int idpreventa;
	
	
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdpreventa() {
		return idpreventa;
	}
	public void setIdpreventa(int idpreventa) {
		this.idpreventa = idpreventa;
	}
	
	@Override
	public String toString() {
		return "datosentrada [idproducto=" + idproducto + ", cantidad=" + cantidad + ", idpreventa=" + idpreventa + "]";
	}
	
}
