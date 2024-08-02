package listes;
import java.util.List;
import java.util.ArrayList;


public class Liste {


    public static void main(String[] args){
        Objet objet1 = new Objet("crayon", 258, "rouge");
        Objet objet2 = new Objet("ordi", 76, "noir");
        Objet objet3 = new Objet("bouteille", 451, "jaune");
        Objet objet4 = new Objet("téléphone", 78, "jaune");

        // System.out.println(objet1);
        // System.out.println(objet2);
        // System.out.println(objet3);
        // System.out.println(objet4);

        // création d'une liste pour contenir les objets
        List<Objet> objets = new ArrayList<>();
        // ajout des objets dans la liste 
        objets.add(objet1);
        objets.add(objet2);
        objets.add(objet3);
        objets.add(objet4);
        //affichage de la liste "objets"
        // System.out.println(objets);

        // filtrage pour récupérer le premier objet jaune de la liste
        Objet objetJaune = objets.stream().filter(objet -> objet.getCouleur().equals("jaune")).toList().get(0);
        System.out.println(objetJaune);

        // filtrage des objets "jaune" dans la liste 
        List<Objet> objetsJaune = objets.stream().filter(objet -> objet.getCouleur().equals("jaune")).toList();
        System.out.println(objetsJaune);

        // condition dans le filtrage 
        List<Objet> objetsJauneOuRouge = objets.stream().filter(objet -> objet.getCouleur().equals("jaune") || objet.getCouleur().equals("rouge")).toList();
        System.out.println(objetsJauneOuRouge);

    }

}