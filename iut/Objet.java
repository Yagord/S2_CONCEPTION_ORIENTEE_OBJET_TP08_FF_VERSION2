package iut;

import java.awt.Graphics;
import java.awt.*;

/**
 * Objet de base du jeu
 *  Implémente Dessinable pour pouvoir se dessiner 
 *  Implémente Evoluable pour pouvoir se déplacerXY
 *  Ajoute des fonctionnalités de testerCollision entre objets
 * @author aguidet
 */
public abstract class Objet implements Dessinable, Evoluable {
	private final String _nomSprite;
	private final Jeu _jeu;
	private double _x;
	private double _y;

	/**
	 * Initialise un objet dessinable, déplaçable
	 * @param aG le jeu dans lequel l'objet est contenu
	 * @param aNom le nom du sprite utilisé pour dessiner l'objet
	 * @param aX point gauche de l'objet
	 * @param aY point haut de l'objet
	 */
	public Objet(Jeu aG, String aNom, double aX, double aY) {
		throw new UnsupportedOperationException();
	}

	/**
	 * position gauche
	 * @return la position à gauche (en pixels) de l'objet
	 */
	public int posGauche() {
		throw new UnsupportedOperationException();
	}

	/**
	 * position haute
	 * @return la position en haut (pixels) de l'objet
	 */
	public int posHaute() {
		throw new UnsupportedOperationException();
	}

	/**
	 * largeur
	 * @return la largeur (en pixels) de l'objet
	 */
	public int largeur() {
		throw new UnsupportedOperationException();
	}

	/**
	 * position droite
	 * @return la position droite (en pixels) de l'objet
	 */
	public int posDroite() {
		throw new UnsupportedOperationException();
	}

	/**
	 * position basse
	 * @return la position basse (pixels) de l'objet
	 */
	public int posBasse() {
		throw new UnsupportedOperationException();
	}

	/**
	 * absisse du milieu
	 * @return l'absisse médiane de l'objet
	 */
	public int milieuX() {
		throw new UnsupportedOperationException();
	}

	/**
	 * ordonnée du milieu
	 * @return l'ordonnée médiane de l'objet
	 */
	public int milieuY() {
		throw new UnsupportedOperationException();
	}

	/**
	 * lien sur le jeu
	 * @return le jeu dans lequel l'objet est contenu
	 */
	public Jeu leJeu() {
		throw new UnsupportedOperationException();
	}

	public void dessiner(Graphics aG) throws Exception {
		throw new UnsupportedOperationException();
	}

	/**
	 * Déplace l'objet de manière relative, en pixels sur les axes X et Y
	 * @param aDx le décalage en pixels sur l'axe X
	 * @param aDy le décalage en pixels sur l'axe Y
	 */
	protected void deplacerXY(double aDx, double aDy) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Déplace l'objet de manière relative, en pixels avec le module et l'angle du déplacement
	 * @param aD le déplacement relatif (pixels)
	 * @param aA l'angle de déplacement (degrés)
	 */
	protected void deplacerDA(double aD, double aA) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Teste la testerCollision entre deux objets
	 * @return true si la testerCollision a eu lieu
	 */
	public abstract boolean testerCollision(Objet aO);

	/**
	 * Action : effet d'une testerCollision entre l'objet et le paramètre
	 */
	public abstract void effetCollision(Objet aO);

	/**
	 * Indique une cha�ne identifiant le type de l'objet
	 */
	public abstract String getTypeObjet();

	public void changeSprite(Object aString_nom) {
		throw new UnsupportedOperationException();
	}
}