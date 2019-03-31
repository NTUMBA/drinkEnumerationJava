package distribuerBoissonVersionEnum.distributeur;


public enum Boissons{

	CAFE("CAFE", 0.50f) {
		@Override
		public void affricherNom() {
			System.out.print(Boissons.CAFE.getId() + " La boisson " + Boissons.CAFE.getNom());	
		}
		@Override
		public void affricherPrix() {
			System.out.println(" coute " + Boissons.CAFE.getPrix() + " euro(s)");	
		}
		@Override
		public void affricherId() {
			System.out.println(Boissons.CAFE.getId());	
		}
		@Override
		public int getId() {
			return 1;
		}
	},THE("THE", 0.60f) {
		@Override
		public void affricherNom() {
			System.out.print(Boissons.THE.getId() + " La boisson " + Boissons.THE.getNom());	
		}
		@Override
		public void affricherPrix() {
			System.out.println(" coute " + Boissons.THE.getPrix() + " euro(s)");	
		}
		@Override
		public void affricherId() {
			System.out.println(Boissons.CAFE.getId());			
		}
		@Override
		public int getId() {
			return 2;
		}
	}, EAU("EAU", 0.40f) {
		@Override
		public void affricherNom() {
			System.out.print(Boissons.EAU.getId() + " La boisson " + Boissons.EAU.getNom());		
		}
		@Override
		public void affricherPrix() {
			System.out.println(" coute " + Boissons.EAU.getPrix() + " euro(s)");			
		}
		@Override
		public void affricherId() {
			System.out.println(Boissons.EAU.getId());	
		}
		@Override
		public int getId() {
			return 3;
		}
	},CHOCOLAT("CHOCOLAT", 0.80f) {
		@Override
		public void affricherNom() {
			System.out.print(Boissons.CHOCOLAT.getId() + " La boisson " + Boissons.CHOCOLAT.getNom());	
		}
		@Override
		public void affricherPrix() {
			System.out.println(" coute " + Boissons.CHOCOLAT.getPrix() + " euro(s)");	
		}
		@Override
		public void affricherId() {
			System.out.println(Boissons.CHOCOLAT.getId());	
		}
		@Override
		public int getId() {
			return 4;
		}
	};


	// LES ATTRIBUTS

	private String nom;
	private float prix;

	// CONSTRUCTEUR

	Boissons(String nom, float prix){
		this.nom = nom;
		this.prix = prix;
	}

	// GETTERS ET SETTERS

	public String getNom() {
		return nom;
	}
	public float getPrix() {
		return prix;
	}
	public abstract int getId();

	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}

	//METHODES ABSTRAITES

	public abstract void affricherId();
	public abstract void affricherNom();
	public abstract void affricherPrix();

	//METHODE "classiques"

	public void AfficherNomEtPrix() {
		affricherNom();
		affricherPrix();

	}
};
