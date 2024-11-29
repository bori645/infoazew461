package factoryAbstract;

public class FactoryAbstractVehicule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Abstract product interfaces
		interface Moto {
		    void methodeMoto();
		}

		interface Vehicule {
		    void methodeVehicule();
		}

		interface Avion {
		    void methodeAvion();
		}

		// Concrete products for Essence
		class MotoEssence implements Moto {
		    @Override
		    public void methodeMoto() {
		        System.out.println("Moto à essence en action !");
		    }
		}

		class VehiculeEssence implements Vehicule {
		    @Override
		    public void methodeVehicule() {
		        System.out.println("Véhicule à essence en action !");
		    }
		}

		class AvionKerozene implements Avion {
		    @Override
		    public void methodeAvion() {
		        System.out.println("Avion au kérosène en action !");
		    }
		}

		// Concrete products for Electrique
		class MotoElectrique implements Moto {
		    @Override
		    public void methodeMoto() {
		        System.out.println("Moto électrique en action !");
		    }
		}

		class VehiculeElectrique implements Vehicule {
		    @Override
		    public void methodeVehicule() {
		        System.out.println("Véhicule électrique en action !");
		    }
		}

		class AvionElectrique implements Avion {
		    @Override
		    public void methodeAvion() {
		        System.out.println("Avion électrique en action !");
		    }
		}

		// Abstract Factory
		interface AbstractFactory {
		    Moto fabriquerMoto();
		    Vehicule fabriquerVehicule();
		    Avion fabriquerAvion();
		}

		// Concrete Factory for Essence
		class FactoryEssence implements AbstractFactory {
		    @Override
		    public Moto fabriquerMoto() {
		        return new MotoEssence();
		    }

		    @Override
		    public Vehicule fabriquerVehicule() {
		        return new VehiculeEssence();
		    }

		    @Override
		    public Avion fabriquerAvion() {
		        return new AvionKerozene();
		    }
		}

		// Concrete Factory for Electrique
		class FactoryElectrique implements AbstractFactory {
		    @Override
		    public Moto fabriquerMoto() {
		        return new MotoElectrique();
		    }

		    @Override
		    public Vehicule fabriquerVehicule() {
		        return new VehiculeElectrique();
		    }

		    @Override
		    public Avion fabriquerAvion() {
		        return new AvionElectrique();
		    }
		}

		// Client
		class Client {
		    public static void main(String[] args) {
		        // Utiliser la Factory Essence
		        AbstractFactory factoryEssence = new FactoryEssence();
		        Moto motoEssence = factoryEssence.fabriquerMoto();
		        motoEssence.methodeMoto();

		        Vehicule vehiculeEssence = factoryEssence.fabriquerVehicule();
		        vehiculeEssence.methodeVehicule();

		        Avion avionEssence = factoryEssence.fabriquerAvion();
		        avionEssence.methodeAvion();

		        // Utiliser la Factory Electrique
		        AbstractFactory factoryElectrique = new FactoryElectrique();
		        Moto motoElectrique = factoryElectrique.fabriquerMoto();
		        motoElectrique.methodeMoto();

		        Vehicule vehiculeElectrique = factoryElectrique.fabriquerVehicule();
		        vehiculeElectrique.methodeVehicule();

		        Avion avionElectrique = factoryElectrique.fabriquerAvion();
		        avionElectrique.methodeAvion();
		    }
		}


	}

}
