package cwFour;
import java.util.Random;

/**
 * @author HP
 *
 */
public class Ship {
	/**
	 * which contains the bow (front) of the ship. 
	 */
	int bowRow = 0;
	int bowColumn = 0;
	/** 
	 * the number of squares occupied by the ship. An "empty sea" location has length 1.
	 */
	int length;
	/** 
	 * If the ship occupies a single row, false otherwise.
	 */
	boolean horizontal = true;
	/** 
	 * An array of booleans telling whether that part of the ship has been hit.
	 */
	Boolean [] hit = new Boolean[4];
	/**
	 * @return the bowRow
	 */
	public int getBowRow() {
		return bowRow;
	}
	/**
	 * @param bowRow the bowRow to set
	 */
	public void setBowRow(int row) {
		bowRow = row;
	}
	/**
	 * @return the bowColumn
	 */
	public int getBowColumn() {
		return bowColumn;
	}
	/**
	 * @param bowColumn the bowColumn to set
	 */
	public void setBowColumn(int column) {
		bowColumn = column;
	}
	/**
	 * @return the horizontal
	 */
	public boolean isHorizontal() {
		return horizontal;
	}
	/**
	 * @param horizontal the horizontal to set
	 */
	public void setHorizontal(boolean horiz) {
		horizontal = horiz;
	}
	/**
	*Returns the type of  ship. This method needs to be overridden
	*/
	String getShipType(){
		String shipType = "noShip";
		return shipType;
	}
	/**
	 * 
	 * @return the length of the ship
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * @return returns sunken status of the ship after a hit
	 */
	public boolean isSunk() {
		boolean sunk = true;
		for (int i = 0; i < this.length; i++) {
		if(!(this.hit[i])) {
		sunk = false;
		}
		}
		return sunk;
		}
	 /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		boolean sunken = this.isSunk();
		String sunk = "-";
		if (sunken){
		sunk = "X";
		}
		else {
			for (int i = 0; i < this.length; i++) {
				if(this.hit[i]) {
					sunk = "S";
				}
			}
		}
		return sunk; 
	 }
	/**
	 * 
	 */
	public boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean){
		boolean okP = false;
		if(ocean.ships[row][column] == null || ocean.ships[row][column].getShipType() != "EmptySea"){
			okP =true;
		}
		return okP;
	}
}
