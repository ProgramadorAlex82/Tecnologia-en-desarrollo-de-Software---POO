/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2;

/**
 *
 * @author Alex Santiago Vanega
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    var semaforo = new Semaforo();
    
    semaforo.semaforoCambio();
    semaforo.cambio();
    semaforo.semaforoCambio();
    semaforo.cambio();
    semaforo.semaforoCambio();
    semaforo.cambio();
    semaforo.semaforoCambio();
    
    var dardos = new Dardos("Axel","Alex");

    
    
 dardos.lanzar();
    dardos.mostrar();
    
    
    
    
    
    }
    
}
