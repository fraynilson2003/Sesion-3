package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaDetalleTO {
    //id VEnta detalle ID venta
    public String idVentaDetalle, idVenta, idProducto;
    public double precioUnit, porcenUtil, cantidad, precioTotal;
    
}
