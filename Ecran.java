import java.awt.Graphics;

/**
 * Représente un écran du jeu.
 * 
 * @author : Guillerme Franck
 */
public abstract class Ecran {
	/**
	 * Graphics pour dessiner des composants awt.
	 */
	private Graphics _graphics;
	public SpaceInvaders _spaceinvaders;

	/**
	 * Renvoie le graphics.
	 */
	public Graphics getGraphics() {
		return this._graphics;
	}

	/**
	 * Dessine l'écran sur la fenêtre de jeu.
	 */
	public abstract void dessinnerEcran();
}