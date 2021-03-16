package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn(boolean estado) {
		if (estado) {
			estado = true;
		}
	}

	public void turnOff(boolean estado) {
		return;
	}
	
	public void CanalUp() {
		if (tv.estado = true) {

			while (tv.canal >= 1 && tv.canal <= 120) {
				tv.canal += 1;
			}

		}

	}

	public void CanalDown() {
		if (tv.estado = true) {
			while (tv.canal >= 1 && tv.canal <= 120) {
				tv.canal -= 1;
			}
		}

	}

	public void volumenUp() {
		if (tv.estado = true) {
			while (tv.volumen >= 0 && tv.volumen <= 7) {
				tv.volumen += 1;
			}

		}
	}

	public void volumenDown() {
		if (tv.estado = true) {
			while (tv.volumen >= 0 && tv.volumen <= 7) {
				tv.canal -= 1;
			}
		}
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
	
	void setEnlazar(TV tv) {
		this.tv = tv;
	}
	
	TV getEnlazar() {
		return tv;
	}
}
