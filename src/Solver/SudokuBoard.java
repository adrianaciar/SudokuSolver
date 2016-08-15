package Solver;

import java.util.ArrayList;
import utils.IntPair;


public class SudokuBoard {
	
	int dashboardSize;
	int regionSize;
	int cellsCompleted;
	ArrayList<IntPair> lastInsertions;
	Cell[][] board;
	
	/*
	public SudokuBoard(int size){
		int[][] aux = new int[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				aux[i][j] = 0;
			}
		}
		this.SudokuBoard(aux);
	}*/
		
	public SudokuBoard(int[][] matrix){
		dashboardSize = matrix[0].length;
		regionSize = (int)Math.sqrt(dashboardSize);
		cellsCompleted = 0;
		
		lastInsertions = new ArrayList<IntPair>();
		
		board = new Cell[dashboardSize][dashboardSize];
		for(int i=0; i<dashboardSize; i++){
			for(int j=0; j<dashboardSize; j++){
				board[i][j] = new Cell(dashboardSize);
			}
		}
	}

	public boolean isComplete(){
		return cellsCompleted == dashboardSize * dashboardSize;
	}
	
	public ArrayList<Cell> cellOrderedByAmountOfOptions(){
		
		ArrayList<Cell> list = new ArrayList<Cell>();
		for(int i=0; i<dashboardSize; i++){
			for(int j=0; j<dashboardSize; j++){
				if(board[i][j].getAmountOfOptions() >= 0){
					list.add(board[i][j]);
				}
			}
		}
		list.sort(null);
		
		return list;
	}
	
	public void insertNumberAt(int n, IntPair location){
		
		board[location.getX()][location.getY()].setData(n);
		
		cellsCompleted++;
		
		updateOptions(location);
		
		lastInsertions.add(location);
	}
	
	public void undoLastInsert(){
		
	}
	
	public IntPair getLocationFor(Cell cell){
		return new IntPair(1,1);
	}
	
	private void updateOptions(IntPair pair){
		
		int n =  board[pair.getX()][pair.getY()].getData();
		
		for(int i=0; i<dashboardSize; i++){
			board[pair.getX()][i].removeOptions(n);
			board[i][pair.getY()].removeOptions(n);
		}
		
	
		
	}
	

}
