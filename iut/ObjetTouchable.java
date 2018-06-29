package iut;

import java.awt.*;

/**
 * Représente un objet qui implémente la notion de testerCollision
 *  La testerCollision est ici basique (testerCollision de rectangles)
 * @author aguidet
 */
public abstract class ObjetTouchable extends Objet {

	/**
	 * Construit un objet touchable
	 * @param aG le jeu contenant l'objet
	 * @param aNom le nom de l'objet (sprite)
	 * @param aX pixel gauche de départ
	 * @param aY pixel haut de départ
	 */
	public ObjetTouchable(Jeu aG, String aNom, int aX, int aY) {
		throw new UnsupportedOperationException();
	}

	public boolean testerCollision(Objet aO) {
		throw new UnsupportedOperationException();
	}
}