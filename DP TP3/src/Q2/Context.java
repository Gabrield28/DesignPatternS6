package Q2;

public class Context {

	private SaveStrategy strategy;

	public Context(SaveStrategy strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy(String s) {
		// crée une grille vide
		CGrille9x9 grille = new CGrille9x9();
		// Place des chiffres aléatoirement
		for (int x=1; x<10; x++)
			for (int y=1; y<10;y++)
				grille.set(x,y,(int)(Math.random()*9+1));
		
		strategy.save(s, grille);
		return;
	}
}
