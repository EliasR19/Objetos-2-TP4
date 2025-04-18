package trabajador;

import java.time.Month;

public class Ingreso {
	
	private Month mesPercepcion;
	private double montoPercibido;
	
	public Ingreso(Month mesPercepcion, double montoPercibido) {
		this.montoPercibido = montoPercibido;
		this.mesPercepcion = mesPercepcion;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public double getMontoImponible() {
		return montoPercibido;
	}
}
