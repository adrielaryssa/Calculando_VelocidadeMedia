
package Atividades;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Double dist,temp,velomed;
        System.out.println("Digite a distancia eem metros:");
        Scanner teclado= new Scanner(System.in);
        dist=teclado.nextDouble();
        System.out.println("Agora digite o tempo em segundos do percurso");
        temp=teclado.nextDouble();
        velomed=dist/temp;
        System.out.println("A velocidade média é de:"+velomed);
        
    }
}
