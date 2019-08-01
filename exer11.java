/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranqueira;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;

public class Tranqueira {

   public static void main(String[] args) {
 // TODO code application logic here
 Scanner teclado = new Scanner(System.in);
 double N1, N2, N3, med = 0;
 System.out.println("Informe o primeira nota");
 N1 = teclado.nextDouble();
 System.out.println("Informe o segunda nota");
 N2 = teclado.nextDouble();
 System.out.println("Informe o terceira número");
 N3 = teclado.nextDouble();
 if(N1 > N2 && N1 >N3){
        med = (((N1 * 4) + (N2 * 3) + (N3*3)) / 10);
        System.out.println("A media  = " + med);
 }
 if(N2 > N1 && N2 >N3){
        med = (((N2 * 4) + (N1 * 3) + (N3*3)) / 10);
        System.out.println("A media é = " + med);
 }
 if(N3 > N1 && N3 >N2){
        med = (((N3 * 4) + (N1 * 3) + (N2 * 3)) / 10);
        System.out.println("A media é = " + med);
 }
 System.out.println("As notas do alunos são: = " + N1 + " "+ N2 + " "+ N3);
      if(med >= 5.0){
            System.out.println("Aluno aprovado");
    }else{
            System.out.println("Reprovado");
        
    }
    }
    
}
