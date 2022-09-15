package mercadocentral;

public class Impuesto implements Factura {
	private double montoAPagar;
	
	
	public Impuesto (double monto) {
		this.montoAPagar= monto;
	}
	
	public double getMontoAPagar() {
		return montoAPagar;
	}


	@Override
	public double montoTotal() {
		// TODO Auto-generated method stub
		return this.getMontoAPagar();
	}
}
