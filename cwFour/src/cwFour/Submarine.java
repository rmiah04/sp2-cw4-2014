/**
 * 
 */
package cwFour;

import java.util.Random;

/**
 * @author HP
 *
 */
public class Submarine extends Ship {
	Submarine(){
		Random orientation = new Random();
		this.length = 1;
		if (this.length > 1){
			this.horizontal = orientation.nextBoolean();
			//changes the orientation of the grid randomly so that ship can be vertical or horizontal
		}
		this.hit[0] = false;
	}
	@Override public String getShipType(){
		String shipType = "Submarine";
		return shipType;
	}
	
}
