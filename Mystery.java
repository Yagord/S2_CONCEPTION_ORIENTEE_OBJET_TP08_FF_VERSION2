import iut.Objet;
import iut.ObjetTouchable;

/**
 * Représente un vaisseau mystère qui est un ObjetTouchable.
 * 
 * @author : Forgeron Nicolas
 */
public class Mystery extends ObjetTouchable {
	/**
	 * Entier contenant la vitesse du vaisseau mystère.
	 */
	private int _vitese;
	/**
	 * Entier contenant la direction du vaisseau mystère.
	 */
	private int _direction;

	/**
	 * Action : effet d'une testerCollision entre l'objet et le paramÃ¨tre
	 */
	public void effetCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Indique une chaîne identifiant le type de l'objet
	 */
	public String getTypeObjet() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Fait Ã©voluer l'objet
	 * @param aDt le temps Ã©coulÃ© en millisecondes depuis le prÃ©cÃ©dent appel
	 */
	public void evoluer(long aDt) {
		throw new UnsupportedOperationException();
	}

	Teste la testerCollision entre deux objets
	public boolean testerCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}
}