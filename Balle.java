import iut.ObjetTouchable;

/**
 * Repr�sente une balle qui est un ObjetTouchable.
 * 
 * @author : Guillerme Franck
 */
public abstract class Balle extends ObjetTouchable {

	/**
	 * Indique une cha�ne identifiant le type de l'objet
	 */
	public String getTypeObjet() {
		throw new UnsupportedOperationException();
	}
}