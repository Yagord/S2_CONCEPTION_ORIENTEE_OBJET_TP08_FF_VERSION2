import iut.Objet;

/**
 * Repr�sente une balleJoueur qui est une Balle.
 * 
 * @author : Guillerme Franck
 */
public class BalleJoueur extends Balle {

	/**
	 * Action : effet d'une testerCollision entre l'objet et le paramètre
	 */
	public void effetCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Fait évoluer l'objet
	 * @param aDt le temps écoulé en millisecondes depuis le précédent appel
	 */
	public void evoluer(long aDt) {
		throw new UnsupportedOperationException();
	}

	public String getTypeObjet() {
		throw new UnsupportedOperationException();
	}

	Teste la testerCollision entre deux objets
	public boolean testerCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}
}