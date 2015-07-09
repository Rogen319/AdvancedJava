package chapter22_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Copy {

	public static void main(String[] args) {

		//Ì½¾¿copyµÄÇ³¸´ÖÆ
		List<String> list1 = Arrays.asList("red","green","blue");
		List<String> list2 = Arrays.asList("pink","sdfdsf");
		Collections.copy(list1, list2);
		System.out.println(list1);
		System.out.println(list2);
		list2.set(0, "brown");
		System.out.println(list1);
		System.out.println(list2);
	}

}
