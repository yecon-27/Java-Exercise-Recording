package wku.ava.arrays;

public class ArrayTest {
	public static void main(String[] args){
		//新数组默认的每一个位子上的值都是0
		int[] values = new int[5];
		int i;
		for(i = 1; i < 5; i++) {
			//输出索引值为1-4的值
			values[i] = i + values[i-1];
			System.out.println(values[i]);
		}	
		//输出索引值为0的值
		values[0] = values[1] + values[4];
		System.out.println(values[0]);
			//Cong Ye 1306248
			
		
	}

}
