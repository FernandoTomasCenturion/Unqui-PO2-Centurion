package mercadocentral;

public class Servicio implements Factura {
	private double costoPorUnidadConsumida;
	private int    cantidadDeUnidadesConsumida;

	public Servicio(double costoPorUnidad, int cantUnidades) {
		this.costoPorUnidadConsumida = costoPorUnidad;
		this.cantidadDeUnidadesConsumida = cantUnidades;
	}

	public double getCostoPorUnidadConsumida() {
		return costoPorUnidadConsumida;
	}

	public int getCantidadDeUnidadesConsumida() {
		return cantidadDeUnidadesConsumida;
	}
	
	public double montoDeUnidades() {
		return this.getCantidadDeUnidadesConsumida() * this.costoPorUnidadConsumida;
	}

	@Override
	public double montoTotal() {
		// TODO Auto-generated method stub
		return this.montoDeUnidades();
	}
}
