/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dafpa
 */
public class MusicTic {

    public static void main(String[] args) {    
    }
    
    public static List<Integer> obtenerCancionesNoRepetidas (List<Integer> E1){
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < E1.size(); i++){
            if(!salida.contains(E1.get(i))){
                salida.add(E1.get(i));
            }
        }return salida;  
    }
    
    public List<Integer> obtenerPosicionesConCancion(List<Integer> E1, List<Integer> E2, int E3){
        
        ArrayList<Integer> nova = new ArrayList<>();
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < E2.size(); i++){
            if(Objects.equals(E2.get(i), E3)){
                nova.add(i);
            }   
        }
        for(int i = 0; i < E1.size(); i++){
            for(int j = 0; j < nova.size(); j++){
                if(E1.get(i).equals(nova.get(j))){
                    salida.add(E1.get(i));
                }
            }
        }return salida;
        }
   
    public List<Integer> soloCategoriaX(List<Integer> E1, List<Integer> E2){
        E1.removeAll(E2);
        return E1;
    }
    
    public Integer cantidadCambios(List<Integer> E1, List<Integer> E2){
        List<Integer> A1= new ArrayList<>();
        A1.addAll(E1);
        E1.removeAll(E2);
        E2.removeAll(A1);
        int alpha = E1.size();
        int beta = E2.size();
        return Math.min(alpha, beta);
    }
}
