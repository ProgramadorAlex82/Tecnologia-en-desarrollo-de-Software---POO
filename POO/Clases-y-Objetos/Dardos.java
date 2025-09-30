/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

import java.util.Random;

public class Dardos {
    
    Random rand = new Random();
    
    
String nombre,nombre2;
int puntuacion=501;
int puntuacion2=501;


    public Dardos(String nombre, String nombre2) {
        this.nombre = nombre;
        this.nombre2 = nombre2;
    }

    
    public void lanzar(){
    
    while (puntuacion>0 && puntuacion2>0){
        
        System.out.println("Ha tirado: "+nombre);
        for (int n=1;n<4;++n){
        
        int dardo = rand.nextInt(20); 
        int zona = rand.nextInt(3)+1; 
        System.out.println("Dardo "+n+ ": "+dardo+" Zona: "+zona );
    
        if (zona==2){
        
        dardo=dardo*2;
        }
        
        if (dardo>puntuacion){
        
       dardo=0;
        } 

            if (zona==3){
        
        dardo=dardo*3;
        }
        
        if (dardo>puntuacion){
        
       dardo=0;
        } 

            
        if (dardo==0){
        
        dardo=50;
        }
        
        if (dardo>puntuacion){
        
       dardo=0;
        } 

        
        puntuacion=puntuacion-dardo;
     
        }
        
         System.out.println("Puntuacion Actual: "+puntuacion);
         System.out.println("------------------------------------------------");
         
         
    //----------------------------------------------------------------
      
    System.out.println("Ha tirado: "+nombre2);
    for (int n=1;n<4;++n){
        
        
        int dardo = rand.nextInt(20); 
        int zona = rand.nextInt(3)+1; 
        System.out.println("Dardo "+n+ ": "+dardo+ " Zona: "+zona );
    
       
        if (zona==2){
        
        dardo=dardo*2;
        }
        
       if (dardo>puntuacion2){
        
        dardo=0;
        }
        
        if (zona==3){
        
        dardo=dardo*3;
        }
        if (dardo>puntuacion2){
        
        dardo=0;
        }
        if (dardo==0){
        
        dardo=50;
        }
        
        if (dardo>puntuacion2){
        
        dardo=0;
        }
        puntuacion2=puntuacion2-dardo;
       
      }
    System.out.println("Puntuacion Actual: "+puntuacion2);
        System.out.println("------------------------------------------------");
    }
    
    }
    

public void mostrar(){

    System.out.println("Nombre: "+nombre+"-"+"Puntuacion Final: "+puntuacion);
System.out.println("Nombre: "+nombre2+"-"+"Puntuacion Final: "+puntuacion2);

}


}
