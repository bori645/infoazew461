package adaptateur_exemple3;

public class ajout_trapeze {

	public static void main(String[] args) {
		
		class Trapeze implements Icarre {
		    private float base1;
		    private float base2;
		    private float hauteur;
		    private float cote1;
		    private float cote2;

		    public Trapeze(float base1, float base2, float hauteur, float cote1, float cote2) {
		        this.base1 = base1;
		        this.base2 = base2;
		        this.hauteur = hauteur;
		        this.cote1 = cote1;
		        this.cote2 = cote2;
		    }

		    @Override
		    public float aire() {
		        return ((base1 + base2) * hauteur) / 2;
		    }

		    @Override
		    public float perimetre() {
		        return base1 + base2 + cote1 + cote2;
		    }
		}


	}

}
