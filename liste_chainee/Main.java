package liste_chainee;

import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList l = new MyList();
		l.add("zahra");
		l.addLast("zahra-5");
		l.add("zahra-2");
		l.add("zahra-3");
		l.addLast("zahra-6");
		l.add("zahra-4");
		l.add("test",6);
		System.out.println(l.toString()); 
		System.out.println(l.get(5)); 
		System.out.println(l.sumLetter());
	}

}
