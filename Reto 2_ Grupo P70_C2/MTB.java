/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dafpa
 */
public class MTB extends Bicicleta {
    
    private final int peso;

    public MTB(int peso, String tipo, int dimensionRin, 
            int numeroVelocidades, String materialMarco) {
        super(tipo, dimensionRin, numeroVelocidades, materialMarco);
        this.peso = peso;
    }
    
    
    @Override
    public String toString() {
        //return "MTB{" + "peso=" + peso + '}';
        String salida;
        salida = "\t"+"Bicicleta " + tipo + " - Material: " + materialMarco + "\n" +
                 "\t"+"dimension: rin: " + dimensionRin + "\n" +
                 "\t"+"velocidades: " + numeroVelocidades + "\n" +
                 "\t"+"peso: " + peso + "kg";
        
        return salida;
        
    }

    
    
    
    
    
 
}
