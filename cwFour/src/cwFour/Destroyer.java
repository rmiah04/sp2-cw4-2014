/**
 * 
 */
package cwFour;

/**
 * @author HP
 *
 */
public class Destroyer extends Ship {
	Destroyer(){
		this.length = 2;
		this.hit[0] = false;
		this.hit[1] = false;
	}
	@Override String getShipType(){
		String shipType = "Destroyer";
		return shipType;
	}
}
