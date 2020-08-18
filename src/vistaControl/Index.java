package vistaControl;

import java.util.List;
import Modelo.producto;
import modeloDAO.productoDOA;
import utils.leer;
public class Index {
  
   public static void agregarProducto(){
    int idproducto;
    String nombre;
    Boolean precio;
    String codigo;
    int stock;
    String estado; 
    System.out.println("Agregar Nuevo Producto");
        System.out.print("Idproducto: ");
        idproducto = leer.cadena();
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Precio: ");
        precio = leer.cadena();
        System.out.print("Codigo: ");
        codigo = leer.cadena();
        System.out.print("Stock: ");
        stock = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        
  
   }
   public static void listarProducto(){
         listarProducto();
        System.out.print("Ingrese el ID del Estudiante a Eliminar: ");
        int id = leer.entero();
        productoDOA estudianteDAO = new productoDOA();
        estudianteDAO.eliminarproducto(id);
    }
   
   public static void editarProducto(){
       
   }
   public static void eliminarProducto(){
       
   }
   public static void salir(){
    System.out.println("Gracias por su visita");
   }
    public static void error(int tipo){
        switch(tipo){
            case 1:
                System.out.println("Opción fuera de rango");
                break;
            case 2:
                System.out.println(".....");
                break;
        }}
   public static void menu(){
        System.out.println("Menu Principal");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Eliminar Producto");
        System.out.println("3. Editar Producto");
        System.out.println("4. Listar Producto");
        System.out.println("5. Salir");
        System.out.print("Elegir las opciones [1-5]: ");
        
    }
    
    public static void inicio(){
        int opcion;
        do {            
            menu();
            opcion = leer.entero();
            switch(opcion){
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    editarProducto();
                    break;
                case 4:
                    listarProducto();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    error(1);
            }            
        } while (opcion!=5);
    }
    public static void main(String[] args) {
        inicio();
    }
}
