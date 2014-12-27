package examenenero2014;

import java.util.ArrayList;

public class PruebaProducto {
    
    
    public static void main(String[] args) {
        
        ArrayList<Producto> productos1 = new ArrayList<>();
        ArrayList<Producto> productos2 = new ArrayList<>();
    
        productos1.add(new ProductoBasico(1, "dilma", "sae", 1));
        productos1.add(new ProductoBasico(2, "pepe", "sae", 1));
        productos1.add(new ProductoBasico(3, "mario", "sae", 1));
        productos1.add(new ProductoBasico(4, "karla", "sae", 2));
        
        productos2.add(new ProductoBasico(5, "lo que sea", "guapo", 2));
        productos2.add(new ProductoBasico(6, "lo que sea2", "guapo2", 2));

        
        Menu menu1 = new Menu(100, "pepa", productos1, 1);
        Menu menu2 = new Menu(101, "cacharel", productos2, 1);
                
        ArrayList<Producto> menuDoble = new ArrayList<>();
        menuDoble.add(menu1);
        menuDoble.add(menu2);
        
        
        Ventas ventas = new Ventas (1000, "prueba 1", menuDoble, 1);
        
        ventas.add(new ProductoBasico(7, "pepee", "dfdf", 5));
        ventas.add(productos1);
  
        
        //System.out.println(ventas.unidadesVendidas(500));
        
        //System.out.println(ventas.getDescripcion());
        for (Producto venta : ventas.conjuntoVentas()) {
            System.out.println(venta.getNombre());
            
        }
        
        
        
        
        
        
        
       
        
    }
    
}
