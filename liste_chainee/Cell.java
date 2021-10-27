package liste_chainee;

public class Cell {
	private String s;
	private Cell nextCell ;
	
	public Cell(String cell) {
		this.s = cell;
		
	}
	public Cell(String s , Cell cell) {
		this.s = s;
		this.setNextCell(cell);
		
	}
	public void setNextCell(Cell nextCell) {
		this.nextCell = nextCell;
	}

	public Cell getNextCell() {
		return this.nextCell;
	}

	public String getString() {
		return s;
	}

	public void setString(String cell) {
		this.s = cell;
	}
	 
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.getString();
}
	
}
