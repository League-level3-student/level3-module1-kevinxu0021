package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> arrayList = new ArrayList<String>();
		// 2. Add five Strings to your list
		arrayList.add("apples");
		arrayList.add("oranges");
		arrayList.add("bananas");
		arrayList.add("avocados");
		arrayList.add("carrot");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < arrayList.size(); i++) {
			String cache = arrayList.get(i);
			System.out.println(cache);
		}
		// 4. Print all the Strings using a for-each loop
		for (String cache : arrayList) {
			System.out.println(cache);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < arrayList.size(); i++) {
			if ((i + 1) % 2 == 0) {
				String cache = arrayList.get(i);
				System.out.println(cache);
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			String cache = arrayList.get(i);
			System.out.println(cache);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).contains("e")) {
				String cache = arrayList.get(i);
				System.out.println(cache);
			}
		}
	}
}
