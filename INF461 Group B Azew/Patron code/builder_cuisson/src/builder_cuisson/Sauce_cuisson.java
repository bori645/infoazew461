package builder_cuisson;

public class Sauce_cuisson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Classe représentant les ingrédients de la sauce
		class Sauce {
		    private String huile;
		    private String tomate;
		    private String cube;
		    private String arrachideFrais;

		    // Constructeur privé
		    private Sauce(SauceBuilder builder) {
		        this.huile = builder.huile;
		        this.tomate = builder.tomate;
		        this.cube = builder.cube;
		        this.arrachideFrais = builder.arrachideFrais;
		    }
		    
		    // Méthode toString pour afficher la sauce
		    @Override
		    public String toString() {
		        return "Sauce{" +
		                "huile='" + huile + '\'' +
		                ", tomate='" + tomate + '\'' +
		                ", cube='" + cube + '\'' +
		                ", arrachideFrais='" + arrachideFrais + '\'' +
		                '}';
		    }

		    // Builder static
		    class SauceBuilder {
		        private String huile;
		        private String tomate;
		        private String cube;
		        private String arrachideFrais;

		        public SauceBuilder setHuile(String huile) {
		            this.huile = huile;
		            return this;
		        }
		        
		        public SauceBuilder setTomate(String tomate) {
		            this.tomate = tomate;
		            return this;
		        }

		        public SauceBuilder setCube(String cube) {
		            this.cube = cube;
		            return this;
		        }

		        public SauceBuilder setArrachideFrais(String arrachideFrais) {
		            this.arrachideFrais = arrachideFrais;
		            return this;
		        }

		        public Sauce build() {
		            return new Sauce(this);
		        }
		    }
		}

		// Classe principale
		class Main {
		    public static void main(String[] args) {
		        Sauce sauce = new Sauce.SauceBuilder()
		                .setHuile("Huile d'olive")
		                .setTomate("Tomate fraîche")
		                .setCube("Cube de bouillon")
		                .setArrachideFrais("Arrachide frais")
		                .build();

		        System.out.println(sauce);
		    }
		}



	}

}
