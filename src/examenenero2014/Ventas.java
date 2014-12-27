package examenenero2014;
import java.util.*;

public class Ventas implements Producto{
    private int codigo;
    private String nombre;
    private ArrayList<Producto> productosVendidos;
    private double precio;
    
    public Ventas(int codigo, String nombre, ArrayList<Producto> productosVendidos, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.productosVendidos = productosVendidos;
        this.precio = precio;

    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getDescripcion() {
        String ristra = "";
        for (Producto productosVendido : productosVendidos) {
            ristra = ristra + productosVendido.getDescripcion() + "\n";
        }
        return ristra;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getDescuento() {
        return totalDescuentos();
    }
    
    public boolean add(Producto p){
        return this.productosVendidos.add(p);
    }
    
    public void add(ArrayList<Producto> p){
        for (Producto producto : p) {
            productosVendidos.add(producto);
        }
    }
    
    public boolean remove(int i){
        
        if( i < productosVendidos.size() && i > 0 ){
            this.productosVendidos.remove(i);
            return true;
        }
        return false;        
    }
    
    public int unidadesVendidas(int codigo){
        
        for (Producto productosVendido : productosVendidos) {
            if (codigo == productosVendido.getCodigo()) {
                if( productosVendido instanceof ProductoBasico){
                    return 1;
                }
                else{
                    if( productosVendido instanceof Menu){
                        Menu menu = (Menu)productosVendido;
                        return menu.arrayContenido.size();
                    }
                }
            }
        }
        return 0;
      
    }
    
    public double totalDescuentos() {
        double descuento = 0;
        for (Producto productosVendido : productosVendidos) {
            descuento = descuento + productosVendido.getDescuento();
        }
        return descuento;
    }
    
    public Set<Producto> conjuntoVentas(){
        Set<Producto> ventas = new HashSet<>();
        for (Producto venta : productosVendidos) {
            ventas.add(venta);
        }
        
        return ventas;
    }
}
