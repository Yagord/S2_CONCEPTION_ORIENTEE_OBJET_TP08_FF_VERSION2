import java.util.Vector;

/**
 * Représente un mur qui est une liste de partieMur.
 * 
 * @author : Grillet Valentin
 */
public class Mur {
	public SpaceInvaders _spaceinvaders;
	public Vector<PartieMur> _partieMurs = new Vector<PartieMur>();

	/**
	 * Crée un mur au position x, y.
	 * x et y sont les coordonnées du point supérieur gauche.
	 */
	public void creerMur(Object aInt_x, Object aInt_y) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Supprime une partie du mur.
	 */
	public void supprimePartieMur(PartieMur aPartieMur) {
		throw new UnsupportedOperationException();
	}
}