import iut.Objet;
import iut.ObjetTouchable;

/**
 * Représente un ennemi qui est un ObjetTouchable.
 * 
 * @author : Chassagne Pierre-Nicolas
 */
public abstract class Ennemi extends ObjetTouchable implements Tireur {
	/**
	 * Entier contenant un nombre aléatoire entre 0 et 1000 représentant la chance qu'a un ennemi de tirer à chaque tour.
	 */
	private int _chanceTir;
	/**
	 * Entier contenant une constante représentant la valeur à dépasser pour tirer.
	 * Exemple : 999
	 * 
	 * Donc probabilité de tir :
	 * 1/1000
	 */
	private static int _chanceEnnemi;
	/**
	 * Chaine de caractères contenant le sprite actuel de l'objet.
	 */
	private String _etatAnimation;
	/**
	 * Chaine de caractères contenant le sprite1 de l'objet.
	 * Un Ennemi possède deux sprites pour l'animation.
	 */
	private String _sprite1;
	/**
	 * Chaine de caractères contenant le sprite2 de l'objet.
	 * Un Ennemi possède deux sprites pour l'animation.
	 */
	private String _sprite2;
	public VagueEnnemi _vague;

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
	 * Renvoie un booléen indiquant si l'ennemi à toucher un des bord (gauche ou droit de l'écran).
	 */
	public boolean testChangementDirection() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Déplace l'ennemi.
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
	 * Gère l'animation de l'ennemi.
	 */
	public void animerEnnemi() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Met à jour le score.
	 */
	public void miseAJourScore() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Met à jour la constante chanceEnnemi.
	 */
	public void miseAJourChance() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Met à jour la vitesse de l'ennemi.
	 */
	public void miseAJourVitesse() {
		throw new UnsupportedOperationException();
	}
}