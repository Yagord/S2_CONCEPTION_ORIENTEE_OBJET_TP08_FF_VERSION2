import java.util.Vector;
import iut.Audio;
import java.awt.Graphics;
import iut.Jeu;

/**
 * ReprÈsente un Jeu SpaceInvaders.
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
	 * cr√©e tous les objets du jeu. Appel√© en d√©but de partie.
	 */
	public void creeObjets() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Dessine le fond d'√©cran
	 * @param aG la surface d'affichage
	 */
	public void dessinerArrierePlan(Graphics aG) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Action √  ex√©cuter lorsque le jeu est perdu
	 */
	public void perdu() {
		throw new UnsupportedOperationException();
	}

	/**
	 * action √  ex√©cuter lorsque le jeu est gagn√©
	 */
	public void gagne() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Le joueur a-t-il gagn√© ?
	 * @return true si la partie est gagn√©e
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
	 * Met ‡ jour le score prennant en paramËtre un String (getTypeObjet).
	 */
	public void ajouterScore(String aValeur) {
		throw new UnsupportedOperationException();
	}
}