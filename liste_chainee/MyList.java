package liste_chainee;


public class MyList {
	private Cell first = null;
	private int size;

	public MyList() {
		this.size = 0;
	}

	public void add(String newString) throws NullPointerException{
		if(newString == null) {
			throw new NullPointerException();
		}

		Cell newCell = new Cell(newString , this.first);

		this.first = newCell;
		this.size ++;
	}

	public int size() {
		return this.size;
	}

	@Override
	public String toString(){
		String celluleDeLaListe ="";
		Cell c = this.first;
		while(c != null) {
			if(c.getNextCell() == null) {
				celluleDeLaListe += c.toString();
			}else {
				celluleDeLaListe += c.toString() + ", ";
			}

			c = c.getNextCell();
		}
		return celluleDeLaListe;
	}


	public void addLast(String newString) throws NullPointerException{
		if(newString == null) {
			throw new NullPointerException();
		}
		if(this.first == null) {
			add(newString);
		}else {
			Cell c = this.first;
			boolean foo = true;
			while(c != null && foo == true ) {
				if(c.getNextCell() == null) {

					Cell newCell= new Cell(newString , null);
					c.setNextCell(newCell) ;
					this.size++;
					foo =false;
				}
				c = c.getNextCell();

			}
		}
		
	}

	public String get(int i){
		if(i < 0 || i> this.size-1) {
			// TODO: handle exception
			throw new IllegalArgumentException();
		}
		Cell c = this.first;
		int indexes =0;
		while(c != null && indexes <= size-1 ) {
			if(i == indexes) {
				return c.toString();
			}
			c = c.getNextCell();
			indexes ++;

		}
		return "";

	}

	public void add(String newString , int i) throws NullPointerException{

		if(newString == null) {
			throw new NullPointerException();
		}


		Cell c = this.first;
		int indexes =1;
		boolean foo =false;
		while(c != null && indexes <= size && foo ==false) {
			if(i == 0) {

				Cell newCell = new Cell(newString , c);
				this.first = newCell;
				this.size ++;
				foo =true;
			}
			else if(i == indexes) {
				if(i == size) {

					Cell newCell = new Cell(newString , null);
					c.setNextCell(newCell);
					this.size ++;
					foo =true;
				}else {
					Cell oldCell = c;
					Cell oldCellNextCell = oldCell.getNextCell();
					Cell newCell = new Cell(newString , oldCellNextCell);
					oldCell.setNextCell(newCell);

					this.size ++;
					foo =true;
				}

			}
			c = c.getNextCell();
			indexes ++;
		}
	}
	
	
	public int sumLetter() {
		int somme=0;
		Cell c = this.first;
		for(int i=0 ; i < this.size ; i++) {
			somme += c.getString().length();
			c = c.getNextCell();
		}
		return somme;
	}

}
