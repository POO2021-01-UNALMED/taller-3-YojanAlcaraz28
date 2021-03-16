package taller3.televisores;

import java.util.ArrayList;

public class TV {
	public Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	public Control control;
	private static TV numTV;
	
	public TV(String marca, String estado) {

	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getControl() {
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

	public static int getnumTV() {
		return numTV;
	}

	public void turnOn(boolean estado) {
		if (estado) {
			estado = true;
		}
	}

	public void turnOff(boolean estado) {
		return;
	}

	boolean getEstado() {
		return estado;

	}

	public void CanalUp() {
		if (estado = true) {

			while (canal >= 1 && canal <= 120) {
				canal += 1;
			}

		}

	}

	public void CanalDown() {
		if (estado = true) {
			while (canal >= 1 && canal <= 120) {
				canal -= 1;
			}
		}

	}

	public void volumenUp() {
		if (estado = true) {
			while (volumen >= 0 && volumen <= 7) {
				volumen += 1;
			}

		}
	}

	public void volumenDown() {
		if (estado = true) {
			while (volumen >= 0 && volumen <= 7) {
				volumen -= 1;
			}
		}
	}
}
