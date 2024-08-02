package exercicesalgo;

import java.util.Scanner;
import java.util.InputMismatchException;



public class Ex1 {
// SI UN CHIFFRE EST PAIR IL EST AJOUTE - SI UN CHIFFRE EST IMPAIR IL EST SOUSTRAIT
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

    public static int evenOdd(int num){
    
        if (num % 2 == 0){
           return num;
        }else{
            return - num;
        }


    }
  
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) { // Utilisation de try-with-resources
            System.out.println("Ecrire un nombre");
            int a = in.nextInt();
            System.out.println("a: " + a);

            System.out.println("Ecrire un nombre");
            int b = in.nextInt();
            System.out.println("b: " + b);

            System.out.println("Ecrire un nombre");
            int c = in.nextInt();
            System.out.println("c: " + c);

            int resultA = evenOdd(a);
            int resultB = evenOdd(b);
            int resultC = evenOdd(c);

            System.out.println("resultat : " + (resultA + resultB + resultC));
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Veuillez entrer un nombre valide.");
        }
    }
}

