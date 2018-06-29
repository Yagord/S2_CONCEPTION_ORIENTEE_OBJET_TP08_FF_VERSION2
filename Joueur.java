import iut.Audio;
import iut.Objet;
import iut.ObjetTouchable;
import java.awt.KeyListener;

/**
 * Repr�sente un joueur qui est un ObjetTouchable.
 * 
 * @author : Forgeron Nicolas
 */
public class Joueur extends ObjetTouchable implements KeyListener, Tireur {
	/**
	 * Entier contenant le nombre de vie du joueur.
	 */
	private int _nbVie;
	/**
	 * Bool�en indiquant si le joueur est en vie.
	 */
	private boolean _enVie;
	/**
	 * Entier contenant la vitesse de d�placement du joueur.
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
	 * Renvoie le bool�en enVie.
	 */
	public boolean getEnVie() {
		return this._enVie;
	}

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
	 * Effectue les actions  si une touche du clavier est press�.
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