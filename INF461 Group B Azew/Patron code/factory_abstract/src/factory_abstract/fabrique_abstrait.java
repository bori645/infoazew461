package factory_abstract;

public class fabrique_abstrait {
	
	
	// Produit abstrait
	interface Moto {
	    void afficherType();
	}

	// Produit concret pour Essence
	class MotoEssence implements Moto {
	    @Override
	    public void afficherType() {
	        System.out.println("Moto à essence.");
	    }
	}

	// Produit concret pour Electrique
	class MotoElectrique implements Moto {
	    @Override
	    public void afficherType() {
	        System.out.println("Moto électrique.");
	    }
	}

	// Fabrique abstraite
	interface Factory {
	    Moto creerMoto();
	}

	// Fabrique concrète pour Essence
	class FactoryEssence implements Factory {
	    @Override
	    public Moto creerMoto() {
	        return new MotoEssence();
	    }
	}

	// Fabrique concrète pour Electrique
	class FactoryElectrique implements Factory {
	    @Override
	    public Moto creerMoto() {
	        return new MotoElectrique();
	    }
	}

	// Client
	public class Client {
	    public static void main(String[] args) {
	        // Utilisation de la fabrique Essence
	    	Factory factoryEssence = new FactoryEssence();
	        Moto motoEssence = factoryEssence.creerMoto();
	        motoEssence.afficherType();

	        // Utilisation de la fabrique Electrique
	        Factory factoryElectrique = new FactoryElectrique();
	        Moto motoElectrique = factoryElectrique.creerMoto();
	        motoElectrique.afficherType();
	    }
	}
	
	



}
