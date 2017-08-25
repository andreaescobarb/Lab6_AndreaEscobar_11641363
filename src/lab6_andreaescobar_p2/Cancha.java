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
public class Cancha extends Lugar{
    private String categoria;
    private boolean estado;

    public Cancha(String categoria, boolean estado, String nombre, int nivelseguridad, String direccion, int entradas, int salidas) {
        super(nombre, nivelseguridad, direccion, entradas, salidas);
        this.categoria = categoria;
        this.estado = estado;
    }

    public Cancha() {
        super();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cancha{" + "categoria=" + categoria + ", estado=" + estado + '}';
    }
}
