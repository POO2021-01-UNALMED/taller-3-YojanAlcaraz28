package taller3.televisores;

public class Control {
	private TV tv;
	
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
