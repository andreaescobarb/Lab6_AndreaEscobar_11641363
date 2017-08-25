/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_andreaescobar_p2;

/**
 *
 * @author andre
 */
public class Restaurante extends Lugar{
    private String categoria;
    private int calificacion;

    public Restaurante() {
        super();
    }

    public Restaurante(String categoria, int calificacion, String nombre, int nivelseguridad, String direccion, int entradas, int salidas) {
        super(nombre, nivelseguridad, direccion, entradas, salidas);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "categoria=" + categoria + ", calificacion=" + calificacion + '}';
    }
    
}
