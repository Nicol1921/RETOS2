import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        
    int i,tiempo_ganador=100000;
    String nombre_ganador="H";
    Scanner lectura=new Scanner(System.in);

    System.out.println("Ingrese los jugadores");
    i=lectura.nextInt();
    String [] n_jugadores=new String[i];
    int [] tiempo=new int[i];

        for(int j=0; j<i; j++){
        System.out.println("Ingrese los nombres de lus jugadores");
         n_jugadores[j]=lectura.next();

        System.out.println("Ingrese el tiempo recorrido");
        tiempo[j]=lectura.nextInt();

        if (tiempo[j]< tiempo_ganador){
            nombre_ganador=n_jugadores[j];
            tiempo_ganador=tiempo[j];
        }
    }
        
        for(int x=0;x<i;x++){
            System.out.println(" nombre  " + n_jugadores[x]+ " tiempo  " + tiempo[x]);
        }

        System.out.println("El ganador es  "+ nombre_ganador+ " con un tiempo de "+tiempo_ganador);
    
        
      
        lectura.close();
    }
   
}


