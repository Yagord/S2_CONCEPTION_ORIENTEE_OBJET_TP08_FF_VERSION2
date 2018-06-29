/**
 * Représente le score.
 * 
 * @author : Chassagne Pierre-Nicolas
 */
public class Score {
	/**
	 * Entier contenant un score.
	 */
	private int _score;
	public SpaceInvaders _spaceinvaders;

	/**
	 * Ajoute un certain val au score en fonction d'un String (getTypeObjet).
	 */
	public void ajouteScore(Object aString_valeur) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Renvoie le score.
	 */
	public int getScore() {
		return this._score;
	}

	/**
	 * Modifie le score.
	 */
	public void setScore(int aScore) {
		this._score = aScore;
	}
}