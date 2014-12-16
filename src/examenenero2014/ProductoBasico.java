package examenenero2014;

public class ProductoBasico implements Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    
    public ProductoBasico(int c, String n, String d, double p){
        codigo = c;
        nombre = n;
        descripcion = d;
        precio = p;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }    
    public double getDescuento(){
        return 0;
    }
}
