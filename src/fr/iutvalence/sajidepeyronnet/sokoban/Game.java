package fr.iutvalence.sajidepeyronnet.sokoban;

import static fr.iutvalence.sajidepeyronnet.sokoban.Case.BOX;
import static fr.iutvalence.sajidepeyronnet.sokoban.Case.WALL;

import java.util.Arrays;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Game {
    /** TODO. */
    private Checkerboard checkerboard;
    /** TODO. */
    private Position player;
    /** TODO. */
    private Position[] boxes;
    
    private Position[] targets;
    /** TODO. */
    private int round;
    /** TODO. */
    private String playerName;

    public Game(String playerName) {
    	checkerboard = new Checkerboard();
    	player = checkerboard.getPlayerInitialPosition();
    	boxes  = checkerboard.getBoxesInitialPositions();
    	targets = checkerboard.getBoxesFinalPositions();
    	round = 0;
    	this.playerName = playerName; 
    }
    private int i;
    private int j=0;
    
    private boolean victory() 
    {
    	for (i=0; i<targets.length; i++)
    	{    	
    		j=0;   		
    		while (j!=2 && !targets[i].equals(boxes[j]))
    		{
    			j++;
    		}  		
    		if (!targets[i].equals(boxes[j]))
    		{
    			return false;
    		}
    	}
    	return true;
    }
    
    
	public void start() {
		checkerboard.print();
		
		while (!victory())
		{
			// TODO Implement interactive
			char move = 'z';
			
			Position anciennePosition = this.player;
			Position nouvellePosition;
			
			if (move == 'z')
			{
				nouvellePosition = anciennePosition.PositionZ();
			}
			
			
			if (box.[nouvellePosition.y][nouvellePosition.x] == 
			{
				
			}
		
		}
			
		
		
		
		
		/*	while (!victory()) {
				Demander la translation
				
				Calculer la nouvelle position du joueur
				
				Vérifier la possibilité de jouer rééllement le coup
					=> Demander à Checkboard ce qu'il y a la nouvelle coordonnée
					=> Décision en fonction
				
				Jouer le coup
				    => Travail restant !
			
		}
	*/	
		}
		
	
}
