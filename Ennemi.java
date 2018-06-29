import iut.Objet;
import iut.ObjetTouchable;

/**
 * Repr�sente un ennemi qui est un ObjetTouchable.
 * 
 * @author : Chassagne Pierre-Nicolas
 */
public abstract class Ennemi extends ObjetTouchable implements Tireur {
	/**
	 * Entier contenant un nombre al�atoire entre 0 et 1000 repr�sentant la chance qu'a un ennemi de tirer � chaque tour.
	 */
	private int _chanceTir;
	/**
	 * Entier contenant une constante repr�sentant la valeur � d�passer pour tirer.
	 * Exemple : 999
	 * 
	 * Donc probabilit� de tir :
	 * 1/1000
	 */
	private static int _chanceEnnemi;
	/**
	 * Chaine de caract�res contenant le sprite actuel de l'objet.
	 */
	private String _etatAnimation;
	/**
	 * Chaine de caract�res contenant le sprite1 de l'objet.
	 * Un Ennemi poss�de deux sprites pour l'animation.
	 */
	private String _sprite1;
	/**
	 * Chaine de caract�res contenant le sprite2 de l'objet.
	 * Un Ennemi poss�de deux sprites pour l'animation.
	 */
	private String _sprite2;
	public VagueEnnemi _vague;

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

	/**
	 * Renvoie le sprite1 de l'objet pour l'animation.
	 */
	public abstract String getSprite1();

	/**
	 * Renvoie le sprite2 de l'objet pour l'animation.
	 */
	public abstract String getSprite2();

	/**
	 * Tire une balleInvader.
	 */
	public void tirer() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Renvoie un bool�en indiquant si l'ennemi � toucher un des bord (gauche ou droit de l'�cran).
	 */
	public boolean testChangementDirection() {
		throw new UnsupportedOperationException();
	}

	/**
	 * D�place l'ennemi.
	 * x += vitesse * direction.
	 */
	public void deplacerEnnemi() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Descend l'ennemi.
	 * y += 10.
	 */
	public void descendreEnnemi() {
		throw new UnsupportedOperationException();
	}

	/**
	 * G�re l'animation de l'ennemi.
	 */
	public void animerEnnemi() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Met � jour le score.
	 */
	public void miseAJourScore() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Met � jour la constante chanceEnnemi.
	 */
	public void miseAJourChance() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Met � jour la vitesse de l'ennemi.
	 */
	public void miseAJourVitesse() {
		throw new UnsupportedOperationException();
	}
}