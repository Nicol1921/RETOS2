import java.util.Scanner;
public class Reto4 {
        public static void main(String[] args) {
            int n,suma=0;
            Scanner lectura=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas y columnas: ");
        n=lectura.nextInt();
        int[][] sudoku = new int[n][n];
        
        System.out.println("Ingrese los valores que desea almacenar en el sudoku:");
        for (int i=0; i<n; i++) {
            for (int x=0; x<n; x++) {
                sudoku[i][x] = lectura.nextInt();
            }
        }
        System.out.println("lo que almaceno en el sudoku es:");
        for (int i=0; i<n; i++) {
            for (int x=0; x<n; x++) {
                System.out.print(sudoku[i][x] + " ");
            }
            System.out.println();
            }
        for(int i=0;i<n;i++){
            for (int x=0; x<n; x++) {
                suma += +sudoku[i][x];
            System.out.println("la suma es de: "+suma);
            }
        }
           lectura.close();
        } 
        }