package patronComposite_exercice;
import java.util.ArrayList;
import java.util.List;


public class patron_compositeTXT_PDF {

	public static void main(String[] args) {
		
		// Composant
		interface Component {
		    void decrire();
		    void ajouter(Component c);
		    void supprimer(Component c);
		    Component obtenir(int index);
		}

		// Fichier (Feuille)
		class File implements Component {
		    private String nom;
		    private String type; // "txt" ou "pdf"
		    
		    public File(String nom, String type) {
		        this.nom = nom;
		        this.type = type;
		    }

		    @Override
		    public void decrire() {
		        System.out.println("Fichier: " + nom + " (" + type + ")");
		    }

		    @Override
		    public void ajouter(Component c) {
		        throw new UnsupportedOperationException("Impossible d'ajouter dans un fichier");
		    }

		    @Override
		    public void supprimer(Component c) {
		        throw new UnsupportedOperationException("Impossible de supprimer dans un fichier");
		    }

		    @Override
		    public Component obtenir(int index) {
		        throw new UnsupportedOperationException("Impossible d'obtenir un élément dans un fichier");
		    }
		}

		// Dossier (Composite)
		class Directory implements Component {
		    private String nom;
		    private String type; // Toujours "dossier"
		    private List<Component> elements;
		    
		    public Directory(String nom) {
		        this.nom = nom;
		        this.type = "dossier";
		        this.elements = new ArrayList<>();
		    }

		    @Override
		    public void decrire() {
		        System.out.println("Dossier: " + nom);
		        for (Component elem : elements) {
		            elem.decrire(); // Appel récursif pour décrire les éléments dans le dossier
		        }
		    }

		    @Override
		    public void ajouter(Component c) {
		        elements.add(c);
		    }

		    @Override
		    public void supprimer(Component c) {
		        elements.remove(c);
		    }

		    @Override
		    public Component obtenir(int index) {
		        return elements.get(index);
		    }
		}

		class FileSystem {
		    public static void main(String[] args) {
		        // Création de fichiers
		        File file1 = new File("Document1", "txt");
		        File file2 = new File("Document2", "pdf");
		        
		        // Création de dossiers
		        Directory folder1 = new Directory("Dossier1");
		        Directory folder2 = new Directory("Dossier2");
		        
		        // Ajout de fichiers dans les dossiers
		        folder1.ajouter(file1);
		        folder2.ajouter(file2);
		        
		        // Création d'un dossier parent
		        Directory rootFolder = new Directory("Root");
		        rootFolder.ajouter(folder1);
		        rootFolder.ajouter(folder2);
		        
		        // Affichage de la structure du système de fichiers
		        rootFolder.decrire();
		        
		        // Obtenir un élément
		        Component elem = rootFolder.obtenir(0);
		        elem.decrire(); // Affiche le premier élément du dossier racine
		    }
		}

	}

}
