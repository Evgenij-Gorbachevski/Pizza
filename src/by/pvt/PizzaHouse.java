package by.pvt;

import by.pvt.Pizza;

public class PizzaHouse {

	// Pizza PizzaName = new Pizza();
	// PizzaName.

	public void hello() {
		System.out.println("������ ����. ��� ������������ ���� ��������.");
	}

	public void whatPizza() {

		System.out.println("- 20");
		System.out.println("- 30");
		System.out.println("- 40");
		System.out.println("- 50");
	}

	public String name(String name) {
		String result = "";

		switch (name) {

		case "��������":
			System.out.println("� ��� ���� ��������� �������");
			break;
		case "4 ������":
			System.out.println("� ��� ���� ��������� �������");
			break;
		case "��������������":
			System.out.println("� ��� ���� ��������� �������");
			break;
		case "�����������":
			System.out.println("� ��� ���� ��������� �������");
			break;

		}
		return result;
	}

	public int size(int size) {
		int result = 0;

		switch (size) {

		case 20:
			System.out.println("������� �� �����.");
			break;
		case 30:
			System.out.println("������� �� �����.");
			break;
		case 40:
			System.out.println("������� �� �����.");
			break;
		case 50:
			System.out.println("������� �� �����.");
			break;

		}

		return result;
	}

	public String question(String d) {
		String result = "";

		switch (d) {

		case "��":
			System.out.println("� ��� ���� ����� �����:");
			System.out.println("- ��������");
			System.out.println("- 4 ������");
			System.out.println("- ��������������");
			System.out.println("- �����������");
			break;
		case "���":
			System.exit(0);
			break;

		}

		return result;

	}

}
