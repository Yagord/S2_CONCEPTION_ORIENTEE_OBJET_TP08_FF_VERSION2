import iut.ObjetTouchable;

/**
 * Représente une balle qui est un ObjetTouchable.
 * 
 * @author : Guillerme Franck
 */
public abstract class Balle extends ObjetTouchable {

	/**
	 * Indique une chaîne identifiant le type de l'objet
	 */
	public String getTypeObjet() {
		throw new UnsupportedOperationException();
	}
}