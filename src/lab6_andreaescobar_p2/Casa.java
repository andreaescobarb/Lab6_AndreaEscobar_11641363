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
public class Casa extends Lugar{

    public Casa(String nombre, int nivelseguridad, String direccion, int entradas, int salidas) {
        super(nombre, nivelseguridad, direccion, entradas, salidas);
    }

    @Override
    public String toString() {
        return "Casa{" + '}';
    }
    
}
