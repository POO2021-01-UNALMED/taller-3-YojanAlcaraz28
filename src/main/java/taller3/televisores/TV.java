package taller3.televisores;


public class TV {
	public Marca marca;
	public int canal = 1;  /////static
	private int precio = 500;
	public boolean estado;
	public int volumen = 1;
	public Control control;
	static  int numTV;

	public TV(Marca marca, boolean estado) {
		TV.numTV++;
		this.estado = estado;
		this.marca = marca;

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

	public void volumenUp() {
		if (estado == false) {
			return;
		}
		if (volumen >= 7) {
			return;
		}
		++canal;

		}
	

	public void volumenDown() {
		if (estado == false) {
			return;
		}
		if (volumen <=0) {
			return;
		}
		--canal;
	}

	public int getCanal() {
		return this.canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void turnOn() {
		if (estado == false) {
			estado = true;
		}
	}

	public void turnOff() {
		if (estado == true) {
			estado = false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	

	}
	
	/*public void CanalUp() {
		if (estado = true) {

			while (canal >= 1 && canal <= 120) {
				canal += 1;
			}

		}

	}*/
	
	public void canalUp() {
		if (estado == false) {
			return;
		}
		if (canal >= 120) {
			return;
		}
		++canal;
	}


	/*public void CanalDown() {
		if (estado = true) {
			while (canal >= 1 && canal <= 120) {
				canal -= 1;
			}
		}*/
	
	public void canalDown() {
		if (estado == false) {
			return;
		}
		if (canal <=1) {
			return;
		}
		--canal;
	}

	}

	

	

	


