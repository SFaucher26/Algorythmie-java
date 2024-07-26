package exercicesalgo;
import java.util.*;



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
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ecrire un nombre");
        int a = in.nextInt();
        System.out.println("Ecrire un nombre");
        int b = in.nextInt();
        System.out.println("Ecrire un nombre");
        int c = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        Ex1.evenOdd(a); 
        
        System.out.println("resultat : " + (evenOdd(a) + evenOdd(b) + evenOdd(c)));
    }
}

