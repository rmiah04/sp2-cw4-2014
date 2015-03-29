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
	// Test the extended class Battleship
		@Test
		public void testBattleship() {
			Battleship bat = new Battleship();
			//ship type
			assertEquals("Battleship", bat.getShipType());
			//ship length
			assertEquals(4, bat.length);
			// correct retrieval of sunken status
			assertEquals(false, bat.isSunk());
			assertEquals("-", bat.toString());
			bat.hit[0] = true;
			bat.hit[1] = true;
			bat.hit[2] = true;
			bat.hit[3] = true;
			assertEquals(true, bat.isSunk());
			//print character return
			assertEquals("X", bat.toString());
		}
		// Test the extended class Cruiser
		@Test
		public void testCruiser() {
			Cruiser cru = new Cruiser();
			//ship type
			assertEquals("Cruiser", cru.getShipType());
			//ship length
			assertEquals(3, cru.length);
			// correct retrieval of sunken status
			assertEquals(false, cru.isSunk());
			assertEquals("-", cru.toString());
			cru.hit[0] = true;
			cru.hit[1] = true;
			cru.hit[2] = true;
			assertEquals(true, cru.isSunk());
			//print character return
			assertEquals("X", cru.toString());
		}
		// Test the extended class Destroyer
		@Test
		public void testDestroyer() {
			Destroyer des = new Destroyer();
			//ship type
			assertEquals("Destroyer", des.getShipType());
			//ship length
			assertEquals(2, des.length);
			// correct retrieval of sunken status
			assertEquals(false, des.isSunk());
			assertEquals("-", des.toString());
			des.hit[0] = true;
			des.hit[1] = true;
			assertEquals(true, des.isSunk());
			//print character return
			assertEquals("X", des.toString());
		}
		// Test the extended class EmptySea
		@Test
		public void testEmptySea() {
			EmptySea es = new EmptySea();
			//ship type
			assertEquals("EmptySea", es.getShipType());
			//ship length
			assertEquals(1, es.length);
			// correct retrieval of sunken status
			assertEquals(false, es.isSunk());
			assertEquals("-", es.toString());
		}

}
