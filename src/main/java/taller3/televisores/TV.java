package taller3.televisores;

import java.util.ArrayList;

public class TV {
	public Marca marca;
	public int canal = 1;
	private int precio = 500;
	public boolean estado;
	public int volumen = 1;
	public Control control;
	private static TV numTV;

	public TV(Marca marca, boolean estado) {

	}

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return this.control;

	}

	public void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return this.volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getCanal() {
		return this.canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public static TV getnumTV() {
		return numTV;
	}

	boolean getEstado() {
		return estado;

	}

}
