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
		
		//��ʼ��
		Random r = new Random();
		Exp4_1 e = new Exp4_1();
		int[] nums = new int[10];
		
		//���ɲ���ʾ���ɵ�ʮ�������
		for(int i=0;i<nums.length;i++)
			nums[i] = r.nextInt(100);
		System.out.print("���ɵ�������飺");
		e.show(nums);
		
		//�ҳ�����ʾ�����
		System.out.println("���ֵΪ��"+e.maxNum(nums));
		
		//ʹ��ѡ�����򣬲���ʾ����������
		e.selectionSort(nums);
		System.out.print("���������飺");
		e.show(nums);
		
		//��ת����
		e.reverse(nums);
		System.out.print("��ת������飺");
		e.show(nums);
	}
}