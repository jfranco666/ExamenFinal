package Interfaces;

import java.util.List;
import Modelo.producto;

public interface CRUD {
  
    public List listarproducto();
    public producto buscarproducto(int idproducto);
    public boolean agregarproducto(producto producto);
    public boolean editarproducto(producto producto);
    public boolean eliminarproducto(int idproducto);
}
