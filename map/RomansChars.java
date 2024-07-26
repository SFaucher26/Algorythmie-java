package map;
import java.util.HashMap;

// ROMAN TO INTEGER

class RomansChars{
    public int romanToInt(String s) {
        //Création d'une HashMap
        HashMap<Character, Integer> romanCharacters = new HashMap<Character, Integer>();

        //stockage des mes paires clés/valeurs
        romanCharacters.put('I', 1);
        romanCharacters.put('V', 5);
        romanCharacters.put('X', 10);
        romanCharacters.put('L', 50);
        romanCharacters.put('C', 100);
        romanCharacters.put('D', 500);
        romanCharacters.put('M', 1000);
        
        int year = 0;

        // Méthode 
        for(Integer i = 0; i < s.length(); i++){
            // Récupération de la valeur du caractère actuel
            int currentVal = romanCharacters.get(s.charAt(i));
            
            // Récupération de la valeur du caractère suivant (si existe)
            if (i + 1 < s.length()) {
                int nextVal = romanCharacters.get(s.charAt(i + 1));
                
                // Comparaison des valeurs
                if (currentVal < nextVal) {
                    // Soustraction si la valeur actuelle est inférieure à la suivante
                    year -= currentVal;
                } else {
                    // Addition sinon
                    year += currentVal;
                }
            } else {
                // Ajout de la valeur du dernier caractère
                year += currentVal;
            }
        }
        
        // Retour du résultat
        return year;
        }


        // Méthode principale pour tester romanToInt
    public static void main(String[] args) {
       RomansChars transformRomanToInteger = new RomansChars();
        
        // Cas de test
        String test1 = "III";
        String test2 = "IV";
        String test3 = "IX";
        String test4 = "LVIII";
        String test5 = "MCMXCIV";

        // Affichage des résultats
        System.out.println("III -> " + transformRomanToInteger.romanToInt(test1));      // Attendu: 3
        System.out.println("IV -> " + transformRomanToInteger.romanToInt(test2));       // Attendu: 4
        System.out.println("IX -> " + transformRomanToInteger.romanToInt(test3));       // Attendu: 9
        System.out.println("LVIII -> " + transformRomanToInteger.romanToInt(test4));    // Attendu: 58
        System.out.println("MCMXCIV -> " + transformRomanToInteger.romanToInt(test5));  // Attendu: 1994
    }

        }




    
