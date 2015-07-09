package chapter22_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefaultSize {

	public static void main(String[] args) {

		List src1=new ArrayList(3);
		src1.add("a");
		src1.add("b");
		src1.add("c");
		
		List des1=new ArrayList(3);
		System.out.println(des1.size());//是0，而不是3.只有在add或者remove时才会改变，3只代表它的容纳能力是3，而非大小
		Collections.copy(des1,src1);
		
		}

}
