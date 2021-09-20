/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dafpa
 */
public class Bodega {
    
    public static List <Bicicleta> listaCiclas = new ArrayList<>(); 
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcionI = 0;
        
        procesarComandos(lector, opcionI);
    }
    
    
    private static void procesarComandos(Scanner lector,int opcionI){
        do{
            //System.out.println("ID: ");
            String comandos = lector.nextLine();
            String[] separados = comandos.split("&");
           
            opcionI = Integer.parseInt(separados[0]);
            
            switch(opcionI){
                case 1: //Agregar Bicicleta
                    int numeroVelocidades = Integer.parseInt(separados[3]);
                    int dimensionRin = Integer.parseInt(separados[2]);
                    String materialMarco = separados[4];
                    String tipoS = separados[1];
                    
                    if (tipoS.equals("MTB")){
                        int peso = Integer.parseInt(separados[5]);
                        //System.out.println(peso);
                        MTB BiciMTB = new MTB(peso, tipoS, dimensionRin, 
                                numeroVelocidades, materialMarco);
                        listaCiclas.add(BiciMTB);
                    }else{
                        String color = separados[5];
                        Ruta BiciRuta = new Ruta(tipoS, dimensionRin, 
                                numeroVelocidades, materialMarco, color);
                        listaCiclas.add(BiciRuta);
                    }
                    break;
                case 2:// Generar lista
                    System.out.println("***Bodega de bicicletas***");
                    listaCiclas.forEach((item) -> {
                        System.out.println(item);
                            });                   
                    break;
                case 3:
                    // Salir
                    break;
                default:
                    System.out.println("Opción no válida");
            }
    }while (opcionI != 3);
    }
}
    
