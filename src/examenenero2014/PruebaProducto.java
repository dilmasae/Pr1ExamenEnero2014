package examenenero2014;

import java.util.ArrayList;

public class PruebaProducto {
    public static void main(String[] args) {
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(new ProductoBasico(1, "dilma", "sae", 45));
        productos.add(new ProductoBasico(2, "pepe", "sae", 4));
        productos.add(new ProductoBasico(3, "mario", "sae", 5));
        productos.add(new ProductoBasico(4, "karla", "sae", 33));
        
        Menu m1 = new Menu(5, "pepa", productos, 35);
        System.out.println(m1.getDescripcion());
        System.out.println(m1.getDescuento());
        
    }
    
}
