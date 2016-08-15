package Solver;

import java.util.ArrayList;
import Solver.Cell;

public class Solver {

	public void solve(SudokuBoard b){
		
		Cell cell;
		
		while(! b.isComplete()){
			
			ArrayList<Cell> list = b.cellOrderedByAmountOfOptions();
			cell = list.get(0); 
			
			if(cell.getOptions().size() == 0){
				b.undoLastInsert();
			} else { 
				b.insertNumberAt(cell.getOptions().get(0), b.getLocationFor(cell));
			}	
		}
	}
	
}
