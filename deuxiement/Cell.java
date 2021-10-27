package deuxiement;

public class Cell {
	private Object s;
	private Cell nextCell ;
	
	public Cell(Object cell) {
		this.s = cell;
		
	}
	public Cell(Object s , Cell cell) {
		this.s = s;
		this.setNextCell(cell);
		
	}
	public void setNextCell(Cell nextCell) {
		this.nextCell = nextCell;
	}

	public Cell getNextCell() {
		return this.nextCell;
	}

	public Object getObject() {
		return s;
	}

	public void setObject(Object cell) {
		this.s = cell;
	}
	 
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.getObject().toString();
}
	
}
