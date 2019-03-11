import java.io.*;
import java.util.*;


/** Forming a Magic Square Problem **/
/** https://www.hackerrank.com/challenges/magic-square-forming/problem **/

public class Main {
	static int formingMagicSquare(int[][] s) {

		ArrayList<Integer> myArray = new ArrayList<Integer>();

		for (int i = 0; s.length > i; i++) {
			for (int j = 0; s[i].length > j; j++) {
				myArray.add(s[i][j]);
			}
		}

		int[][] solutions = { { 8, 1, 6, 3, 5, 7, 4, 9, 2 }, { 6, 1, 8, 7, 5, 3, 2, 9, 4 },
				{ 4, 9, 2, 3, 5, 7, 8, 1, 6 }, { 2, 9, 4, 7, 5, 3, 6, 1, 8 }, { 8, 3, 4, 1, 5, 9, 6, 7, 2 },
				{ 4, 3, 8, 9, 5, 1, 2, 7, 6 }, { 6, 7, 2, 1, 5, 9, 8, 3, 4 }, { 2, 7, 6, 9, 5, 1, 4, 3, 8 }, };

		// these are 8 permutations for the magic square
		// for a 3x3 grid that are valid for cell values
		// with a range of [1-9]

		int cost = 0;
		int minCost = 100;

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 9; j++) {

				cost += Math.abs(myArray.get(j) - solutions[i][j]);

			}
			if (minCost > cost) {
				minCost = cost;
			}

			cost = 0; //reset the counter after each loop
		
		}

		
		return minCost;

		
	}

	public static void main(String[] args) throws IOException {

		int[][] myTestArray = { { 5, 3, 4 }, { 1, 5, 8 }, { 6, 4, 2 } };

		int result = formingMagicSquare(myTestArray);

		System.out.println(result);

	}

}