/**
 * Représente le meilleur score.
 * 
 * @author : Chassagne Pierre-Nicolas
 */
public class HighScore {
	/**
	 * Entier contenant un highScore.
	 */
	private int _highScore;
	public SpaceInvaders _spaceinvaders;

	/**
	 * Renvoie le score.
	 */
	public int getHighScore() {
		return this._highScore;
	}

	/**
	 * Modifie le score.
	 */
	public void setHighScore(int aScore) {
		this._highScore = aScore;
	}
}