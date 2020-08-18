package Interfaces;

import java.util.List;
import Modelo.producto;

public interface CRUD {
  
    public List listarestudiante();
    public producto buscarestudiante(int idestudiante);
    public boolean agregarestudiante(producto estudiante);
    public boolean editarestudiante(producto estudiante);
    public boolean eliminarestudiante(int idestudiante);
}
