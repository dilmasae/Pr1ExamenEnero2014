package examenenero2014;
import java.util.*;

public class Menu implements Producto{
    
    private int codigo;
    private String nombre;
    protected ArrayList<Producto> arrayContenido;
    private double precio;
    
    public Menu(int codigo, String nombre, ArrayList<Producto> contenido, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.arrayContenido = contenido;
        this.precio = precio;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        String lista = "";
        for(int i = 0; i < arrayContenido.size(); i++ ){
           if( i == arrayContenido.size()-1){
                lista = lista + arrayContenido.get(i).getNombre();    
           }
           else{
                lista = lista + arrayContenido.get(i).getNombre() + ",";    
           }
        }
        return lista;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        double descuento = 0;
        double precioVenta = 0;
        
       for( int i = 0; i < arrayContenido.size(); i++){
           descuento = descuento + arrayContenido.get(i).getDescuento();
           precioVenta = precioVenta + arrayContenido.get(i).getPrecio();
       }
       return descuento + precioVenta - precio;
       
    }
}
