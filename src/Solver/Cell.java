package Solver;

import java.util.ArrayList;

public class Cell implements Comparable<Cell> {
	
	private ArrayList<Integer> options;
	private int data;
	
	
	public int compareTo(Cell c){
		return this.options.size() - c.options.size();
	}
	
	public int getAmountOfOptions(){
		if(options == null){
			return -1;
		} else {
			return options.size();
		}
	}
	
	public Cell(int n){
		data = 0;
		
		options = new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			options.add(i);
		}
		
	}
	
	public ArrayList<Integer> getOptions() {
		return options;
	}
	
	public void setOptions(ArrayList<Integer> options) {
		this.options = options;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void removeOptions(int n){
		options.remove(n);
	}
	
	public void addOptions(int n){
		options.add(n);
	}
	
}
