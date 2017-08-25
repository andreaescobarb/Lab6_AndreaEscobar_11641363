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
public class Carreteras {
    private int distancia;
    private int numero;
    private String inicio;
    private String ending;

    public Carreteras() {
    }

    public Carreteras(int distancia, int numero, String inicio, String ending) {
        this.distancia = distancia;
        this.numero = numero;
        this.inicio = inicio;
        this.ending = ending;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getEnding() {
        return ending;
    }

    public void setEnding(String ending) {
        this.ending = ending;
    }

    @Override
    public String toString() {
        return "Carreteras{" + "distancia=" + distancia + ", numero=" + numero + ", inicio=" + inicio + ", ending=" + ending + '}';
    }
    
}
