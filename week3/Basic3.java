package week3;

import java.util.Scanner;

public class Basic3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String name;
		System.out.print("�̸��� �Է� : ");
		name = scn.next();
		if(name.equals("ȫ�浿")) {
			System.out.printf("�̸��� %s �Դϴ�.\n",name);
		}
		else {
			System.out.printf("%s�� ȫ�浿�� �ƴմϴ�.\n",name);
		}
		scn.close();
	}
} 