package iut;

import java.awt.*;

/**
 * Permet de jouer un fichier son (format wave uniquement)
 * @author aguidet
 * @author thehornycocoboy
 */
public class Audio {
	private AudioInputStream _audioInputStream = null;
	private SourceDataLine _line;
	private String _soundFile;
	public SpaceInvaders _spaceinvaders;
	public Joueur _joueur;

	/**
	 * Charge un fichier son
	 * @param aS le nom du son (sans chemin ni extension) Le fichier son doit avoir une extension wavLe fichier son doit être placé dans les ressources de l'application
	 */
	public Audio(String aS) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Joue le fichier son en arrière-plan
	 */
	public void run() {
		throw new UnsupportedOperationException();
	}
}