package singleton_NoteEtudiant;
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class ClasseNoteSingleton {

    // Instance unique de la classe (Singleton)
    private static ClasseNoteSingleton instance;

    // Map pour stocker les notes avec un ID (clé = ID étudiant, valeur = note)
    private Map<Integer, Float> notes;

    // Constructeur privé pour empêcher l'instanciation directe
    private ClasseNoteSingleton() {
        notes = new HashMap<>();
    }

    // Méthode pour obtenir l'instance unique (Singleton)
    public static ClasseNoteSingleton getInstance() {
        if (instance == null) {
            instance = new ClasseNoteSingleton();
        }
        return instance;
    }

    // Méthode pour ajouter une note
    public void ajouterNote(int id, float note) {
        notes.put(id, note);
        System.out.println("Note ajoutée : ID = " + id + ", Note = " + note);
    }

    // Méthode pour calculer la moyenne des notes
    public float calculerMoyenne() {
        if (notes.isEmpty()) {
            System.out.println("Aucune note disponible pour calculer la moyenne.");
            return 0;
        }
        float somme = 0;
        for (float note : notes.values()) {
            somme += note;
        }
        return somme / notes.size();
    }

    // Méthode pour afficher toutes les notes
    public void afficherNotes() {
        if (notes.isEmpty()) {
            System.out.println("Aucune note à afficher.");
        } else {
            System.out.println("Liste des notes :");
            for (Map.Entry<Integer, Float> entry : notes.entrySet()) {
                System.out.println("ID = " + entry.getKey() + ", Note = " + entry.getValue());
            }
        }
    }

    // Méthode principale pour tester le Singleton
    public static void main(String[] args) {
        ClasseNoteSingleton singleton = ClasseNoteSingleton.getInstance();

        // Ajouter des notes
        singleton.ajouterNote(1, 15.5f);
        singleton.ajouterNote(2, 18.0f);
        singleton.ajouterNote(3, 12.5f);

        // Afficher les notes
        singleton.afficherNotes();

        // Calculer et afficher la moyenne
        float moyenne = singleton.calculerMoyenne();
        System.out.println("Moyenne des notes : " + moyenne);
    }
}




