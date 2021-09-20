/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dafpa
 */
public class Ruta extends Bicicleta {
   
    private final String color;

    public Ruta(String tipo, int dimensionRin, 
            int numeroVelocidades, String materialMarco, String color) {
        super(tipo, dimensionRin, numeroVelocidades, materialMarco);
        this.color = color;
    }

    @Override
    public String toString() {
        //return "Ruta{" + "color=" + color + '}';
        return "\t" + "Bicicleta " + tipo + " - Material: " + materialMarco + "\n" +
               "\t" + "dimension rin: " + dimensionRin + "\n" +
               "\t" + "velocidades: " + numeroVelocidades + "\n" + 
               "\t"+ "color: " + color;
        
        
    }


}
