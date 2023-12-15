package exercice18;

import java.util.ArrayList;

public class Exo {
	/*
	 * 18- Écrivez un programme Java pour comparer deux ArrayList 
	 * et une troisième.
	 * affiche TRUE s’il existe dans la deuxième liste
	 * sinon FALSE
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList();
		list1.add("PHP");
		list1.add("Java");
		list1.add("C++");
		list1.add("Python");

		ArrayList<String> list2 = new ArrayList();
		list2.add("PHP");
		list2.add("Java");
		list2.add("C");
		list2.add("C++");
		
		ArrayList<Boolean> list3 = new ArrayList();
		
		boolean existsInFirstList;
		for(int i = 0; i < list1.size(); i++)
		{
			existsInFirstList = list1.indexOf(list2.get(i)) != -1;
			list3.add(existsInFirstList);
		}
		
		System.out.println(list3);
		
	}

}
