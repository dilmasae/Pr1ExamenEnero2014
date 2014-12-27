package examenenero2014;

public class ProductoBasico implements Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    
    public ProductoBasico(int codigo, String nombre, String descripcion, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
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
    
    public boolean equals(Object p) {
        if(!(p instanceof ProductoBasico))return false;
        
        return codigo == ((ProductoBasico) p).getCodigo();
    }
    
    public int hashCode(){
        return codigo;
    }
}
