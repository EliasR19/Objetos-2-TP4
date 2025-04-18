package trabajador;

import java.time.LocalDate;
import java.time.Month;

public class IngresoHorasExtras extends Ingreso {

	private int cantHorasExtras;
	
	public IngresoHorasExtras(Month mesPercepcion, double montoPercibido, int cantHorasExtras) {
		super(mesPercepcion, montoPercibido);
		this.cantHorasExtras = cantHorasExtras;
	}

	
	 @Override
	 public double getMontoImponible() {
		 return 0;
	 }
	
	
}
