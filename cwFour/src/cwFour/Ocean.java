package cwFour;
/*This contains a 10x10 array of Ships, representing the "ocean", and some methods to manipulate it.*/
import java.util.Scanner;

public class Ocean {
	static Ship[][] ships = new Ship[10][10];
	int shotsFired;
	int hitCount;
	int shipsSunk;
	/*This method prints the status of the ocean after every shot fired.*/
	static void print(){
		System.out.println("   0 1 2 3 4 5 6 7 8 9");
		System.out.println("  ____________________");
        for(int row=0 ; row < 10 ; row++ ){
            System.out.print((row+0)+"|");
            for(int column=0 ; column < 10 ; column++ ){
                //if(ocean[row][column]==-1){
                	System.out.print(" " + ships[row][column]);
             /*       System.out.print("\t"+"~");
                }else if(ocean[row][column]==0){
                    System.out.print("\t"+"*");
                }else if(ocean[row][column]==1){
                    System.out.print("\t"+"X");*/
                //}
                
            }
            System.out.println();
        }
	}
	static void getOcean(){
		print();
	}
	/**
	 * @return the shotsFired
	 */
	public int getShotsFired() {
		return shotsFired;
	}
	/**
	 * @return the hitCount
	 */
	public int getHitCount() {
		return hitCount;
	}
	/**
	 * @return the shipsSunk
	 */
	public int getShipsSunk() {
		return shipsSunk;
	}
}
