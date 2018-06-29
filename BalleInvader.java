import iut.Objet;

/**
 * Repr�sente une balleInvader qui est une Balle.
 * 
 * @author : Guillerme Franck
 */
public class BalleInvader extends Balle {

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

	/**
	 * Teste la testerCollision entre deux objets
	 * @return true si la testerCollision a eu lieu
	 */
	public boolean testerCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}
}