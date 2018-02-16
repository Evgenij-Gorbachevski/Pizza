package by.pvt;

import by.pvt.PizzaHouse;
import by.pvt.Pizza;

public class Main {

	public static void main(String[] args) {

		// ����������� �����
		PizzaHouse pizza1 = new PizzaHouse();
		pizza1.hello();

		// ����� ����������
		Pizza pizza2 = new Pizza();
				
		//����� ����������
		PizzaHouse answer = new PizzaHouse();
		String d = pizza2.decision();
		answer.question(d);
		
		//����� �����
		String nameOfPizza = pizza2.pizza();
		String PizzaName = pizza1.name(nameOfPizza);
		
		//����� �������
		pizza1.whatPizza();
		int size = pizza2.size();
		int size2 = pizza1.size(size);
		
		System.out.println("��� �����: ����� " + nameOfPizza + " �������� " + size + " ����� ����� ����� 15 ����� ");
		
		//
	}

}
