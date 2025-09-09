
import java.util.Arrays;

/**
 *
 * @author Alex Santiago Vanega
 */
public class EV_Prueba1 {
    public static void main(String[] args) {
        
int[] numeros = generarArrayInt(5, 1, 10);
int[] volteado = voltearArrayInt(numeros);
int[] rotadoDerecha = rotaDerechaArrayInt(numeros, 2);
int[] rotadoIzquierda = rotaIzquierdaArrayInt(numeros, 2);
    
        System.out.println(Arrays.toString(numeros));
        System.out.println("Minimo: " +minimoArrayInt(numeros));
        System.out.println("Maximo: " +maximoArrayInt(numeros));
        System.out.println("Media: " +mediaArrayInt(numeros));
        System.out.println("Se encuentra o No?: " +estaEnArrayInt(numeros, 5));
        System.out.println("Posicion en el Array: " +posicionArray(numeros, 4));
        System.out.println("Array Volteado: " +Arrays.toString(volteado));
        System.out.println("Array Rotado a derecha: " +Arrays.toString(rotadoDerecha));
        System.out.println("Array Rotado a Izquierda: " +Arrays.toString(rotadoIzquierda));
    }

    
//---------------------------------------------------------------------------------------------------    

//Genera un Array de numeros enteros de manera aleatoria, con un minimo, maximo y capacidad del array definidas.    
public static int[] generarArrayInt (int n, int min, int max) {

int [] array = new int[n];

for (int i=0; i<n; i++){

array[i] = (int)(Math.random() * (max - min + 1)) + min;

}
return array;
}

//Toma el array generado y busca un numero menor, cada vez que encuentra uno, este se sobre escribe en la variable min.
public static int minimoArrayInt(int [] array){

int min = array[0];

for (int i=1; i < array.length; i++){

if (array[i]< min){

min=array[i];
}
}

 return min;
}

//Toma el array generado y busca un numero mayor, cada vez que encuentra uno, lo sobre escribe en la variable max.
public static int maximoArrayInt(int [] array){

int max = array[0];

for (int i=1; i < array.length; i++){

if (array[i]> max){

max=array[i];
}
}

 return max;
}

//Toma los valores del Array generado y los suma a si mismo, al terminar se divide por su longitud.
public static double mediaArrayInt (int[] array){

int suma = 0;

for (int i=0; i<array.length; i++){

suma+=array[i];

}

return (double) suma/array.length;

}

//Muestra con true o false si un numero se encuentra en el Array generado.
public static boolean estaEnArrayInt(int [] array, int num){

for ( int i=0; i<array.length; i++ ){

if (array[i] == num){
return true;
}

}
return false;
}

//Muestra la posicion en el Array generado de un numero, si no se encuentra, produece -1.
public static int posicionArray(int [] array, int num){

for (int i=0; i<array.length; i++){

if (array [i] == num){
return i;
}

}
return -1;
}

//Toma la posicion del Array generado y resta -1 a la misma, con cada vuelta del for aumentando la resta en 1.
public static int [] voltearArrayInt (int [] array){

int[] invertido = new int[array.length];

for (int i=0; i<array.length; i++){

invertido[i] = array[array.length-1-i];
}
return invertido;

}

//Toma un valor dado(2) y suma +1 en cada vuelta del for, moviendo el valor(2) posiciones a la derecha, el modulo nos permite ajustar la rotacion si esta supera el espacio total del array.
public static int [] rotaDerechaArrayInt(int [] array, int n){

int[] resultado = new int[array.length];

for (int i=0; i<array.length; i++){

int nuevaPos=(i+n)% array.length;
resultado[nuevaPos]=array[i];

}

return resultado;
}
//Toma un valor dado(2) y resta -1 en cada vuelta del for, moviendo el valor(2) posiciones a la izquierda, el modulo nos permite ajustar la rotacion si esta supera el espacio total del array.
public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
    
int[] resultado = new int[array.length];

for (int i = 0; i < array.length; i++) {
    
int nuevaPos = (i - n + array.length) % array.length;
resultado[nuevaPos] = array[i];
    }

return resultado;
}






}




