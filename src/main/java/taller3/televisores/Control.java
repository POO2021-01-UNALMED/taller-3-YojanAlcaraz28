package taller3.televisores;

public class Control {
	public TV tv;
	
	public void turnOn() {
		if (tv.estado == false) {
			tv.estado = true;
		}
	}

	public void turnOff() {
		if (tv.estado == true) {
			tv.estado = false;
		}
	}
	
	/*public void CanalUp() {
		if (tv.estado = true) {

			while (tv.canal >= 1 && tv.canal <= 120) {
				return;
			}

		}
		tv.canal += 1;

	}*/
	
	public void canalUp() {
		if (tv.estado == false) {
			return;
		}
		if (tv.canal >= 120) {
			return;
		}
		++tv.canal;
	}

	/*public void CanalDown() {
		if (tv.estado = true) {
			while (tv.canal >= 1 && tv.canal <= 120) {
				return;
			}
		}
		tv.canal -= 1;

	}*/
	
	public void canalDown() {
		if (tv.estado == false) {
			return;
		}
		if (tv.canal <=1) {
			return;
		}
		--tv.canal;
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
	
	public void setCanal(int canal) {
		this.tv.canal = canal;
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
	
	/*public void setEnlazar(TV tv) {
		this.tv = tv;
	}
	
	TV getEnlazar() {
		return tv;
	}*/
	
	public TV getTv() {
		return this.tv;

	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	
}
