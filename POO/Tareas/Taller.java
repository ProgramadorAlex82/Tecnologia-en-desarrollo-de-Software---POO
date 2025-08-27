
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Santiago Vanegas
 * Codigo: 20251231805
 */
public class Taller {
    public static void main(String[] args) {
        
    String [] nombreDeCadaAlumno = new String [5];
    double [] notasDeCadaAlumno = new double [5];
    double sumaNotas=0;
    double notaAlumnoMayor= Double.MIN_VALUE;
    double notaAlumnoMenor= Double.MAX_VALUE;
    String nombreAlumnoNotaMayor= "";
    String nombreAlumnoNotaMenor= "";
    
    boolean flag=false;
    Scanner in = new Scanner(System.in);
    
    /*Se piden los nombres de los alumnos que se guardaran en un 
    array, con un for para repetir sin necesidad de printear cada vez*/
    for (int i=0; i<5; ++i){
    flag=false;
    
        System.out.println("Por Favor, ingrese el nombre del Alumno " +i);
          nombreDeCadaAlumno[i] = in.nextLine();
    
    while (!flag){
        System.out.println("Por Favor, ingrese la nota de " +nombreDeCadaAlumno[i]);
          notasDeCadaAlumno[i] = in.nextDouble();    
         in.nextLine();
          
         if((notasDeCadaAlumno[i]<0)||(notasDeCadaAlumno[i]>5)){
             System.out.println("Nota no valida, vuelva a ingresar");}else{ flag=true;}
         }
    }
    
   
     //Mencion a cada alumno sobre si aprobo o no
    for (int b=0; b<5; ++b){
    
    if (notasDeCadaAlumno[b]<3){
        System.out.println("El alumno " +nombreDeCadaAlumno[b]+ " ha suspendido");} else {
        
        System.out.println("El alumno " +nombreDeCadaAlumno[b]+ " ha aprobado con un " +notasDeCadaAlumno[b]);
    }    
    }
    
    
    //Calcula la menor nota del curso y de quien fue y a su vez la mayor y de quien fue.
    for (int c=0; c<5; ++c){
    
    if (notasDeCadaAlumno[c]>notaAlumnoMayor){
        
    notaAlumnoMayor=notasDeCadaAlumno[c];
    nombreAlumnoNotaMayor=nombreDeCadaAlumno[c];}
    
    if (notasDeCadaAlumno[c]<notaAlumnoMenor){
        
    notaAlumnoMenor=notasDeCadaAlumno[c];
    nombreAlumnoNotaMenor=nombreDeCadaAlumno[c];}
    }
    
    //Variable para extraer todas la notas del curso y sumarlas
    for (int d=0; d<5; ++d){
        sumaNotas += notasDeCadaAlumno[d];
    }
    
    
    //Promedio de notas de todos los alumnos.
   double promedio= sumaNotas/ 5;
    
        System.out.println("El alumno con mayor nota es " +nombreAlumnoNotaMayor+ " Su nota fue de " +notaAlumnoMayor);
    System.out.println("El alumno con la menor nota es " +nombreAlumnoNotaMenor+ " Su nota fue de " +notaAlumnoMenor);
        System.out.println("El promedio del salon es: " +promedio);
    }
}
