/**
 * 
 */
package cwFour;

/**
 * @author HP
 *
 */
public class Submarine extends Ship {
	Submarine(){
		this.length = 1;
		this.hit[0] = false;
	}
	@Override public String getShipType(){
		String shipType = "Submarine";
		return shipType;
	}
	
}
