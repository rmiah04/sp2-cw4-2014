/**
 * 
 */
package cwFour;

/**
 * @author HP
 *
 */
public class Battleship extends Ship {
	Battleship(){
		this.length = 4;
		this.hit[0] = false;
		this.hit[1] = false;
		this.hit[2] = false;
		this.hit[3] = false;
	}
	@Override String getShipType(){
		String shipType = "Battleship";
		return shipType;
	}
}
