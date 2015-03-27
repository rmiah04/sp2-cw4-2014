/**
 * 
 */
package cwFour;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

/**
 * @author HP
 *
 */
public class ShipTest {
	@Test
	public void testShip() {
		// test the constructors of class
		Ship tship = new Ship();
		// correct retrieval of bow column.
		assertEquals(0, tship.getBowColumn());
		// set new bow column
		tship.setBowColumn(5);
		assertEquals(5, tship.getBowColumn());
		// correct retrieval of bow row.
		assertEquals(0, tship.getBowRow());
		// set new bow row
		tship.setBowRow(5);
		assertEquals(5, tship.getBowRow());
		// check if horizontal
		assertEquals(true, tship.isHorizontal());
		// set horizontal to false
		tship.setHorizontal(false);
		assertEquals(false, tship.isHorizontal());
		
	}

	// Test the extended class submarine
	@Test
	public void testSubmarine() {
		Submarine sub = new Submarine();
		//ship length
		assertEquals(1, sub.length);
		// correct retrieval of bow column.
		assertEquals(0, sub.getBowColumn());
		// set new bow column
		sub.setBowColumn(5);
		assertEquals(5, sub.getBowColumn());
		// correct retrieval of bow row.
		assertEquals(0, sub.getBowRow());
		// set new bow row
		sub.setBowRow(5);
		assertEquals(5, sub.getBowRow());
		// check if horizontal
		assertEquals(true, sub.isHorizontal());
		// set horizontal to false
		sub.setHorizontal(false);
		assertEquals(false, sub.isHorizontal());
		// check if the correct name is returned
		assertEquals("Submarine", sub.getShipType());
		// correct retrieval of sunken status
		assertEquals(false, sub.isSunk());
		sub.hit[0] = true;
		assertEquals(true, sub.isSunk());
		//print character return
		assertEquals("X", sub.toString());
		sub.hit[0] = false;
		assertEquals("-", sub.toString());
	}

}
