package mercadocentral;

public class ProductoDeCooperativa extends Producto {
   
	public ProductoDeCooperativa(double precio) {
		super(precio);

	}
   
	@Override
	public double getMonto() {
		return (super.getMonto() - (super.getMonto() * 0.1));
	}
}

