import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
      
        int notas,n_final=0;

        Scanner lectura=new Scanner(System.in);

    System.out.println("ingrese la cantidad de notas");
    notas=lectura.nextInt();

    int []notas2=new int [notas];
    for( int j=0; j<notas; j++){
        System.out.println("ingrese la nota " +(j+1));
        notas2[j]=lectura.nextInt();

        for(int x=0;x<notas; x++){
            n_final+=notas2[x];
            n_final=n_final/notas;
        }
}
System.out.println(n_final);
if(n_final>40){
    System.out.println("aprobaste con buenos resultados");
    }

    else if (n_final>=30){
    System.out.println("paso raspando");
    }

    else {
        System.out.println("Reprobaste");
    }
lectura.close();
}
}

