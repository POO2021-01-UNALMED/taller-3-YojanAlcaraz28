package test;

import taller3.televisores.Control;
import taller3.televisores.Marca;
import taller3.televisores.TV;

public class Main {

	public static void main(String[] args) {
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, true);
		
		tv1.setCanal(100);
		tv1.canalDown();
		
		TV tv2 =  new TV(marca, false);
		Control control =  new Control();
		control.enlazar(tv2);
		control.setCanal(50);
		control.turnOn();
		control.canalUp();
		
		TV tv3 =  new TV(marca, false);
		tv2.setCanal(121);
		
		boolean ok = false;

	}

}
