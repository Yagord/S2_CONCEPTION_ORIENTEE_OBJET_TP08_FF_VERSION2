import iut.Audio;
import iut.Objet;
import iut.ObjetTouchable;
import java.awt.KeyListener;

/**
 * Représente un joueur qui est un ObjetTouchable.
 * 
 * @author : Forgeron Nicolas
 */
public class Joueur extends ObjetTouchable implements KeyListener, Tireur {
	/**
	 * Entier contenant le nombre de vie du joueur.
	 */
	private int _nbVie;
	/**
	 * Booléen indiquant si le joueur est en vie.
	 */
	private boolean _enVie;
	/**
	 * Entier contenant la vitesse de déplacement du joueur.
	 */
	private int _vitesse;
	public SpaceInvaders _spaceinvaders;
	public Audio _son;

	/**
	 * Renvoie le nombre de vie.
	 */
	public int getNbVie() {
		return this._nbVie;
	}

	/**
	 * Modifie le nombre de vie.
	 */
	public int setNbVie() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Renvoie le booléen enVie.
	 */
	public boolean getEnVie() {
		return this._enVie;
	}

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
	 * Effectue les actions  si une touche du clavier est pressé.
	 */
	public void keyPress(keyEvent aE) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Tire une balleJoueur.
	 */
	public void tirer() {
		throw new UnsupportedOperationException();
	}

	public void setNbVie(int aNbVie) {
		this._nbVie = aNbVie;
	}

	public void setEnVie(boolean aEnVie) {
		this._enVie = aEnVie;
	}

	Teste la testerCollision entre deux objets
	public boolean testerCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}
}