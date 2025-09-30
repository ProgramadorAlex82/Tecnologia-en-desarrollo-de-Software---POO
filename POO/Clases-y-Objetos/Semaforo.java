/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;


public class Semaforo {
    
    int cambio=0;

    public Semaforo() {
    }
    
public void semaforoCambio(){



if(cambio==0){

    System.out.println("Verde");

} 

if(cambio==1){

    System.out.println("Amarillo");

}

if(cambio==2){
System.out.println("Rojo");
cambio=-1;

}

}

public void cambio(){

cambio+=1;

}

}


