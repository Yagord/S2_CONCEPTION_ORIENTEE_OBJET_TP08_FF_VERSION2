import iut.Objet;
import iut.ObjetTouchable;

/**
 * Repr�sente un vaisseau myst�re qui est un ObjetTouchable.
 * 
 * @author : Forgeron Nicolas
 */
public class Mystery extends ObjetTouchable {
	/**
	 * Entier contenant la vitesse du vaisseau myst�re.
	 */
	private int _vitese;
	/**
	 * Entier contenant la direction du vaisseau myst�re.
	 */
	private int _direction;

	/**
	 * Action : effet d'une testerCollision entre l'objet et le paramètre
	 */
	public void effetCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Indique une cha�ne identifiant le type de l'objet
	 */
	public String getTypeObjet() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Fait évoluer l'objet
	 * @param aDt le temps écoulé en millisecondes depuis le précédent appel
	 */
	public void evoluer(long aDt) {
		throw new UnsupportedOperationException();
	}

	Teste la testerCollision entre deux objets
	public boolean testerCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}
}