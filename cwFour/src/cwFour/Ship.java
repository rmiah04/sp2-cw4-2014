package cwFour;

/**
 * @author HP
 *
 */
public class Ship {
	/**which contains the bow (front) of the ship. */
	int bowRow = 0;
	int bowColumn = 0;
	/** the number of squares occupied by the ship. An "empty sea" location has length 1.*/
	int length;
	/** If the ship occupies a single row, false otherwise.*/
	boolean horizontal = true;
	/** An array of booleans telling whether that part of the ship has been hit.*/
	boolean [] hit = new boolean[4];
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
	
	

}
