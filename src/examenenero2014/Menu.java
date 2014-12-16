package examenenero2014;
import java.util.*;

public class Menu implements Producto{
    
    private int codigo;
    private String nombre;
    private ArrayList<Producto> arrayReferencia;
    private double precio;
    
    public Menu(int c, String n, ArrayList<Producto> array,double p){
        codigo = c;
        nombre = n;
        arrayReferencia = array;
        precio = p;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        String lista = "";
        for(int i = 0; i < arrayReferencia.size(); i++ ){
           if( i == arrayReferencia.size()-1){
                lista = lista + arrayReferencia.get(i).getNombre();    
           }
           else{
                lista = lista + arrayReferencia.get(i).getNombre() + ",";    
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
        
       for( int i = 0; i < arrayReferencia.size(); i++){
           descuento = descuento + arrayReferencia.get(i).getDescuento();
           precioVenta = precioVenta + arrayReferencia.get(i).getPrecio();
       }
       return descuento + precioVenta - precio;
       
    }
    
    
    
}
