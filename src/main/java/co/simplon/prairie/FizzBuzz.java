package co.simplon.prairie;


/**
 * Classe de gestion FizzBuzz gérant l'affichage d'une liste d'entiers en respectant les règles suivantes :
 * 1/ si l'entier fourni est un multiple de 3, afficher la chaîne de caractères "Fizz"
 * 2/ si l'entier fourni est un multiple de 5, afficher la chaîne de caractères "Buzz"
 * 3/ dans tout autre cas, afficher l'entier tel quel
 */
public class FizzBuzz {

    /**
     * Constructeur
     */
    public void FizzBuzz() {
    }

    /**
     * Affichage sur la sortie standard (console) de la liste des entiers entre l'index de début
     * et de fin, avec prise en compte des règles de substitutions fournies
     *
     * @param debut Index (entier) de début pour l'affichage
     * @param fin   Index (entier) de fin pour l'affichage
     */
    public void afficherListeEntiers(int debut, int fin) {
    }

    protected String determinerCorrespondance(int entier) {
        // Si le reste de la division par 3 = 0 alors returne Fizz
       
        if (entier == 0)
                 return Integer.toString(0);
        if (entier % 3 == 0)
                 return "Fizz";
        if (entier % 5 == 0)
                 return "Buzz";
        if (entier % 10 == 0)
                 return "Buzz";
        if (entier % 15 == 0)
                 return "Fizz";
        return Integer.toString(entier);
        
    }
}

