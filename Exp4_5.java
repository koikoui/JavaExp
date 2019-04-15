package exp4;

//注意，在eclipse环境下，‘\b’无法退格，在cmd或terminal下可正常显示

import java.util.Scanner;

public class Exp4_5 {
	
	static char ara2Cha(double ara) {
		char Cha = 0;
		switch((int)ara) {
			case 0: Cha = '零';break;
			case 1: Cha = '壹';break;
			case 2: Cha = '贰';break;
			case 3: Cha = '叁';break;
			case 4: Cha = '肆';break;
			case 5: Cha = '伍';break;
			case 6: Cha = '陆';break;
			case 7: Cha = '柒';break;
			case 8: Cha = '捌';break;
			case 9: Cha = '玖';break;
			//case 10: Cha = '拾';break;
			//case 11: Cha = '佰';break;
			//case 12: Cha = '仟';break;
			//case 13: Cha = '万';break;
		}
		return Cha;
	}
	
	int digitCapacity(double num) {
		int capacity = 0;
		if((int)num/10000!=0) capacity = 5;
		else if((int)num/1000!=0) capacity = 4;
		else if((int)num/100!=0) capacity = 3;
		else if((int)num/10!=0) capacity = 2;
		else capacity = 1;
		return capacity;
	}
	
	void print(double num) {
		int dc = digitCapacity(num);
		double t = 0;
		boolean flag=false,flag2=false;
		switch(dc) {
		case 5:
			t = num/10000;
			num %= 10000;
			System.out.printf("%c万",ara2Cha(t));
		case 4:
			t = num/1000;
			num %= 1000;
			if((int)t!=0)
				System.out.printf("%c仟",ara2Cha(t));
			else {
				System.out.printf("%c",ara2Cha(t));
				flag = true;
			}
		case 3:
			t = num/100;
			num %= 100;
			flag2 = true;
			if((int)t!=0)
				System.out.printf("%c佰",ara2Cha(t));
			else if((int)t==0&&!flag) {
				System.out.printf("%c",ara2Cha(t));
				flag = true;
			}
		case 2:
			t = num/10;
			num %= 10;
			if(flag2&&(int)t!=0)
				System.out.printf("%c拾",ara2Cha(t));
			else if(flag2&&(int)t==0&&!flag)
				System.out.printf("%c",ara2Cha(t));
			else if(!flag2)
				System.out.print("拾");
		case 1:
			t = num/1;
			num %= 1;
			if((int)t!=0)
				System.out.printf("%c圆整",ara2Cha(t));
			else
				System.out.print("圆整");
		}
		if(num!=0) {
			t = num/0.1;
			num %= 0.1;
			System.out.print("");
			System.out.printf("\b\b%c角",ara2Cha(t));
			t = num/0.01 + 1;
			System.out.printf("%c分",ara2Cha(t));
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		Exp4_5 e = new Exp4_5();
		e.print(num);
		input.close();
	}
}