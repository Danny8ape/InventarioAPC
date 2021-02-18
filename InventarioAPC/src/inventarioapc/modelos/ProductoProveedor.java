package inventarioapc.modelos;

/**
 *
 * @author Nicolas Soler & Danny Ochoa
 */
public class ProductoProveedor {
    
    private int codigoCompra;
    private int codigoProducto;
    private int cantidad;
    private int subTotal;
    private int CodigoCompraProveedor; 

    public ProductoProveedor() {
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getCodigoCompraProveedor() {
        return CodigoCompraProveedor;
    }

    public void setCodigoCompraProveedor(int CodigoCompraProveedor) {
        this.CodigoCompraProveedor = CodigoCompraProveedor;
    }
    
    
    
}
