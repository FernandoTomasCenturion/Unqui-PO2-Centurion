package mercadocentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
    private List <Producto> productosEnStock;    
    private List <Producto> productosCliente;

    public Caja () {
    	this.productosEnStock = new ArrayList<Producto>();
    	this.productosCliente = new ArrayList<Producto>();
    }
    
    public List<Producto> getProductosEnStock() {
		return productosEnStock;
	}


	private List<Producto> getProductosCliente() {
    	return productosCliente;
    }

    
    public void  agregarProducto(Producto producto) {
      this.getProductosCliente().add(producto);
    }
    
    public int cantidadDeProductosCliente() {
    	return this.productosCliente.size();
    }
    
    public int decrementarStock() {
    	return (this.productosEnStock.size() - 1);
    }
    
    public double montoTotal () {
    	return productosEnStock.stream().mapToDouble(p->p.getMonto()).sum();
    }
    
}