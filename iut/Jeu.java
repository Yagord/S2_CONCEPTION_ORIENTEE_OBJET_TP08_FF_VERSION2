package iut;

import java.awt.image.BufferStrategy;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.*;

/**
 * Représente un jeu de type "2D"
 * Est un écran d'affichage 2D (fenêtre principale)
 * Compose des Objets
 * @author aguidet
 * @author Kevin Glass
 */
public abstract class Jeu {
	private BufferStrategy _strategy;
	private boolean _running = false;
	private final java.util.Vector<Objet> _objets = new ArrayList<Objet>();
	private final java.util.Vector<Objet> _objetsASupprimer = new ArrayList<Objet>();
	private final java.util.Vector<Objet> _objetsACreer = new ArrayList<Objet>();
	private long _lastLoopTime = 0;
	private Cursor _old;

	/**
	 * Crée le jeu
	 * @param aLargeur la largeur en pixels de l'espace de jeu
	 * @param aHauteur la hauteur en pixels de l'espace de jeu
	 * @param aTitle le titre du jeu qui s'affichera dans la fenetre
	 */
	public Jeu(int aLargeur, int aHauteur, String aTitle) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Ajoute un objet dans le jeu. L'objet sera ajouté au prochain "tour"
	 * @param aO l'objet à insérer
	 */
	public void ajouter(Objet aO) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Supprime un objet du jeu au prochain "tour"
	 * @param aO l'objet à supprimer du jeu
	 */
	public void supprimer(Objet aO) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Indique si un objet est dans le jeu
	 * @param aO l'objet à tester
	 * @return true si l'objet est toujours dans le jeu
	 */
	public boolean estEnJeu(Objet aO) {
		throw new UnsupportedOperationException();
	}

	/**
	 * largeur du jeu
	 * @return la largeur du jeu (pixels)
	 */
	public int largeur() {
		throw new UnsupportedOperationException();
	}

	/**
	 * hauteur du jeu
	 * @return la hauteur du jeu (pixels)
	 */
	public int hauteur() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Arrête le jeu
	 */
	public void stopper() {
		throw new UnsupportedOperationException();
	}

	/**
	 * FIn du jeu, mort du joueur
	 */
	public void mourir() {
		throw new UnsupportedOperationException();
	}

	/**
	 * lance le jeu. Celui-ci tourne jusqu'à la fin (gagné ou perdu)
	 */
	public void jouer() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Ajoute un objet interactif pouvant recevoir les évènements du clavier
	 * @param aK l'objet à ajouter
	 */
	protected void ajouteEcouteurClavier(KeyListener aK) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Ajoute un objet interactif pouvant recevoir les évènements de la souris
	 */
	protected void ajouteEcouteurSouris(MouseListener aK) {
		throw new UnsupportedOperationException();
	}

	/**
	 * crée tous les objets du jeu. Appelé en début de partie.
	 */
	protected abstract void creeObjets();

	/**
	 * Dessine le fond d'écran
	 * @param aG la surface d'affichage
	 */
	protected abstract void dessinerArrierePlan(Graphics aG);

	/**
	 * Action à exécuter lorsque le jeu est perdu
	 */
	protected abstract void perdu();

	/**
	 * action à exécuter lorsque le jeu est gagné
	 */
	protected abstract void gagne();

	/**
	 * Le joueur a-t-il gagné ?
	 * @return true si la partie est gagnée
	 */
	protected abstract boolean aGagne();

	/**
	 * Le joueur a-t-il perdu ?
	 * @return true si la partie est perdue
	 */
	protected abstract boolean aPerdu();

	private void cacherCurseur() {
		throw new UnsupportedOperationException();
	}

	private void montrerCurseur() {
		throw new UnsupportedOperationException();
	}

	private void init(int aLargeur, int aHauteur, String aTitle) {
		throw new UnsupportedOperationException();
	}
}