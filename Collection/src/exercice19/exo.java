package exercice19;

import java.util.ArrayList;
import java.util.Collections;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text, textFinal;
		ArrayList<String> list = new ArrayList();
		list.add("PHP");
		list.add("Java");
		list.add("C++");
		list.add("Python");
		
		Collections.swap(list, 0,2);
		
		System.out.println(list);
	}

}
