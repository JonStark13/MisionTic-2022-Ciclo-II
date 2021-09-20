/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author dafpa
 */
public class Bicicleta {
    
    protected String tipo;
    protected int dimensionRin;
    protected int numeroVelocidades;
    protected String materialMarco;

    public Bicicleta(String tipo, int dimensionRin, int numeroVelocidades, String materialMarco) {
        this.tipo = tipo;
        this.dimensionRin = dimensionRin;
        this.numeroVelocidades = numeroVelocidades;
        this.materialMarco = materialMarco;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "tipo=" + tipo + ", dimensionRin=" 
                + dimensionRin + ", numeroVelocidades=" + numeroVelocidades 
                + ", materialMarco=" + materialMarco + '}';
    }
    
    
   
    
}
