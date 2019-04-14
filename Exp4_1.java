package exp4;

import java.util.Random;

public class Exp4_1 {
	
	void show(int[] array) {
		for(int num : array)
			System.out.print(num + " ");
		System.out.printf("\t\n");
	}
	
	int maxNum(int[] array) {
		int max = array[0];
		for(int num : array)
			if(max<num)
				max = num;
		return max;
	}
	
	int[] selectionSort(int[] array) {
		int min = 0;
		for(int i=0;i<array.length;i++) {
			min = i;
			for(int j=i+1;j<array.length;j++)
				if(array[j]<array[min])
					min = j;
			if(i!=min) {
				array[min] = array[i] + array[min];
				array[i] = array[min] - array[i];
				array[min] = array[min] - array[i];
			}
		}
		return array;
	}
	
	int[] reverse(int[] array) {
		for(int i=0;i<array.length/2;i++) {
			array[i] = array[i] + array[array.length-i-1];
			array[array.length-i-1] = array[i] - array[array.length-i-1];
			array[i] = array[i] - array[array.length-i-1];
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		//初始化
		Random r = new Random();
		Exp4_1 e = new Exp4_1();
		int[] nums = new int[10];
		
		//生成并显示生成的十个随机数
		for(int i=0;i<nums.length;i++)
			nums[i] = r.nextInt(100);
		System.out.print("生成的随机数组：");
		e.show(nums);
		
		//找出并显示最大数
		System.out.println("最大值为："+e.maxNum(nums));
		
		//使用选择排序，并显示排序后的数组
		e.selectionSort(nums);
		System.out.print("排序后的数组：");
		e.show(nums);
		
		//反转数组
		e.reverse(nums);
		System.out.print("反转后的数组：");
		e.show(nums);
	}
}