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
		System.out.println(des1.size());//��0��������3.ֻ����add����removeʱ�Ż�ı䣬3ֻ������������������3�����Ǵ�С
		Collections.copy(des1,src1);
		
		}

}
