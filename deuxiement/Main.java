package deuxiement;

import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList l = new MyList();
		l.add("zahra");
		l.addLast(111);
		l.addLast(true);
		System.out.println(l.toString()); 
		System.out.println(l.get(1)); 
		System.out.println(l.sumLetter());
		System.out.println(l.contains("zahra"));
	}

}
