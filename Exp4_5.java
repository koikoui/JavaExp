package exp4;

//ע�⣬��eclipse�����£���\b���޷��˸���cmd��terminal�¿�������ʾ

import java.util.Scanner;

public class Exp4_5 {
	
	static char ara2Cha(double ara) {
		char Cha = 0;
		switch((int)ara) {
			case 0: Cha = '��';break;
			case 1: Cha = 'Ҽ';break;
			case 2: Cha = '��';break;
			case 3: Cha = '��';break;
			case 4: Cha = '��';break;
			case 5: Cha = '��';break;
			case 6: Cha = '½';break;
			case 7: Cha = '��';break;
			case 8: Cha = '��';break;
			case 9: Cha = '��';break;
			//case 10: Cha = 'ʰ';break;
			//case 11: Cha = '��';break;
			//case 12: Cha = 'Ǫ';break;
			//case 13: Cha = '��';break;
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
			System.out.printf("%c��",ara2Cha(t));
		case 4:
			t = num/1000;
			num %= 1000;
			if((int)t!=0)
				System.out.printf("%cǪ",ara2Cha(t));
			else {
				System.out.printf("%c",ara2Cha(t));
				flag = true;
			}
		case 3:
			t = num/100;
			num %= 100;
			flag2 = true;
			if((int)t!=0)
				System.out.printf("%c��",ara2Cha(t));
			else if((int)t==0&&!flag) {
				System.out.printf("%c",ara2Cha(t));
				flag = true;
			}
		case 2:
			t = num/10;
			num %= 10;
			if(flag2&&(int)t!=0)
				System.out.printf("%cʰ",ara2Cha(t));
			else if(flag2&&(int)t==0&&!flag)
				System.out.printf("%c",ara2Cha(t));
			else if(!flag2)
				System.out.print("ʰ");
		case 1:
			t = num/1;
			num %= 1;
			if((int)t!=0)
				System.out.printf("%cԲ��",ara2Cha(t));
			else
				System.out.print("Բ��");
		}
		if(num!=0) {
			t = num/0.1;
			num %= 0.1;
			System.out.print("");
			System.out.printf("\b\b%c��",ara2Cha(t));
			t = num/0.01 + 1;
			System.out.printf("%c��",ara2Cha(t));
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