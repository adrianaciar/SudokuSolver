package main;

import Solver.Solver;
import Solver.SudokuBoard;

public class Launcher {

	public static void main(String[] args) {
		int [][] example = {
				{9,3,0,1,0,0,0,7,0},
				{0,0,0,0,9,0,3,0,4},
				{2,0,0,0,0,0,0,0,0},
				{3,7,0,5,0,1,0,0,0},
				{0,0,0,0,7,0,0,0,3},
				{0,0,0,4,8,0,0,5,0},
				{0,0,4,7,0,0,0,1,8},
				{0,0,0,0,0,0,4,0,2},
				{0,0,0,0,5,0,0,0,0}
		};
		SudokuBoard board = new SudokuBoard(example);
		
		System.out.print(board.toString());
		
		Solver solver = new Solver();
		
		solver.solve(board);
		
		System.out.print(board.toString());
		
		/* Expected result:
				{9,3,6,1,4,8,2,7,5},
				{5,1,8,2,9,7,3,6,4},
				{2,4,7,3,6,5,9,8,1},
				{3,7,9,5,2,1,8,4,6},
				{4,8,5,6,7,9,1,2,3},
				{1,6,2,4,8,3,7,5,9},
				{6,9,4,7,3,2,5,1,8},
				{7,5,3,8,1,6,4,9,2},
				{8,2,1,9,5,4,6,3,7}
		 */
		
	}

}
