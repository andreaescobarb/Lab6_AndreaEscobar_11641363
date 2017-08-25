/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_andreaescobar_p2;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Lugar {
    private String nombre;
    private int nivelseguridad;
    private String direccion;
    private int entradas;
    private int salidas;
    /*    ArrayList<Casa> casa = new ArrayList();
    ArrayList<Restaurante> restaurante = new ArrayList();
    ArrayList<Cancha> cancha = new ArrayList();*/

    public Lugar() {
    }

    public Lugar(String nombre, int nivelseguridad, String direccion, int entradas, int salidas) {
        this.nombre = nombre;
        this.nivelseguridad = nivelseguridad;
        this.direccion = direccion;
        this.entradas = entradas;
        this.salidas = salidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelseguridad() {
        return nivelseguridad;
    }

    public void setNivelseguridad(int nivelseguridad) {
        this.nivelseguridad = nivelseguridad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public int getSalidas() {
        return salidas;
    }

    public void setSalidas(int salidas) {
        this.salidas = salidas;
    }

    @Override
    public String toString() {
        return "Lugar{" + "nombre=" + nombre + ", nivelseguridad=" + nivelseguridad + ", direccion=" + direccion + ", entradas=" + entradas + ", salidas=" + salidas + '}';
    }
    
}
