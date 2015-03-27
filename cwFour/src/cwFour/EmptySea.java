/**
 * 
 */
package cwFour;

/**
 * @author HP
 *Class EmptySea extends Ship Describes a part of the ocean that doesn't have a ship in it.
 */
public class EmptySea extends Ship {
	EmptySea(){
		this.length = 1;
	}
	
	@Override
	public boolean isSunk(){
		return false;
	}
	@Override 
	public String toString(){
		return "-";
	}
	@Override public String getShipType(){
		String shipType = "EmptySea";
		return shipType;
	}

}
