package by.pvt;

import java.util.Scanner;

public class Pizza {
	
	String title;
	int size;
	
	public String decision()	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� �����?");
		String x = sc.next();
		return x;
	}
	
	
	public String pizza() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �������� ����� ");
		String x = sc.next();
		return x;
	}

	public int size() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ ����� ");
		int x = sc.nextInt();
		return x;
	}
	
	
}
