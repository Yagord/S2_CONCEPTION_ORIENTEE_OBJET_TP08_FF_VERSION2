import java.util.Vector;
import iut.Audio;
import java.awt.Graphics;
import iut.Jeu;

/**
 * Repr�sente un Jeu SpaceInvaders.
 * 
 * @author : Chassagne Pierre-Nicolas
 */
public class SpaceInvaders extends Jeu {
	public Joueur _joueur;
	public VagueEnnemi _vague;
	public Vector<Mur> _murs = new Vector<Mur>();
	public Score _score;
	public HighScore _highscore;
	public Audio _audio;
	public Vector<Ecran> _ecrans = new Vector<Ecran>();

	/**
	 * crée tous les objets du jeu. Appelé en début de partie.
	 */
	public void creeObjets() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Dessine le fond d'écran
	 * @param aG la surface d'affichage
	 */
	public void dessinerArrierePlan(Graphics aG) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Action �  exécuter lorsque le jeu est perdu
	 */
	public void perdu() {
		throw new UnsupportedOperationException();
	}

	/**
	 * action �  exécuter lorsque le jeu est gagné
	 */
	public void gagne() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Le joueur a-t-il gagné ?
	 * @return true si la partie est gagnée
	 */
	public boolean aGagne() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Le joueur a-t-il perdu ?
	 * @return true si la partie est perdue
	 */
	public boolean aPerdu() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Charge le meilleur score depuis un fichier.
	 */
	public void chargerHighScore() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Sauvegarde le score et le meilleur score dasn un fichier.
	 */
	public void sauvegarderScoreHighScore() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Met � jour le score prennant en param�tre un String (getTypeObjet).
	 */
	public void ajouterScore(String aValeur) {
		throw new UnsupportedOperationException();
	}
}