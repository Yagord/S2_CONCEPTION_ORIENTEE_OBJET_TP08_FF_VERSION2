import java.util.Vector;

/**
 * Représente une vague d'ennemis qui est une liste d'Ennemi.
 * 
 * @author : Chassagne Pierre-Nicolas
 */
public class VagueEnnemi {
	/**
	 * Entier contenant la vitesse de la vague.
	 */
	private int _vitesse;
	/**
	 * Entier contenant la direction de la vague.
	 */
	private int _direction;
	public SpaceInvaders _spaceinvaders;
	public Vector<Ennemi> _ennemis = new Vector<Ennemi>();

	/**
	 * Crée la vague d'ennemi avec plusieurs types d'ennemis.
	 */
	public void creerVague() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Renvoie la vitesse de la vague.
	 */
	public int getVitesse() {
		return this._vitesse;
	}

	/**
	 * Modifie la vitesse de la vague.
	 */
	public void setVitesse(int aVitesse) {
		this._vitesse = aVitesse;
	}

	/**
	 * Renvoie la direction de la vague.
	 */
	public int getDirection() {
		return this._direction;
	}

	/**
	 * Modifie la direction de la vague.
	 */
	public void setDirection(int aDirection) {
		this._direction = aDirection;
	}

	/**
	 * Descend chaque ennemi de la vague.
	 */
	public void descenteEnnemi() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Supprime un ennemi de la liste d'ennemis.
	 */
	public void supprimeEnnemi(Ennemi aEnnemi) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Renvoie un booléen indiquant si il n'y a aucun ennemi dans la liste d'ennemis.
	 */
	public boolean aucunEnnemi() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Met à jour le score prennant en paramètre un String (getTypeObjet).
	 */
	public void ajouterScore(String aValeur) {
		throw new UnsupportedOperationException();
	}
}