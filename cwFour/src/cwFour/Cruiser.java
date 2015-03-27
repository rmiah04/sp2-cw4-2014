/**
 * 
 */
package cwFour;

/**
 * @author HP
 *
 */
public class Cruiser extends Ship {
	Cruiser(){
		this.length = 3;
		this.hit[0] = false;
		this.hit[1] = false;
		this.hit[2] = false;
	}
	@Override String getShipType(){
		String shipType = "Cruiser";
		return shipType;
	}
}
