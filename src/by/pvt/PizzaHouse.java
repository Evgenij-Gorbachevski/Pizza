package by.pvt;

import by.pvt.Pizza;

public class PizzaHouse {

	// Pizza PizzaName = new Pizza();
	// PizzaName.

	public void hello() {
		System.out.println("Добрый день. Вас приветствует наша пиццерия.");
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

		case "Карпаччо":
			System.out.println("У нас есть следующие размеры");
			break;
		case "4 сезона":
			System.out.println("У нас есть следующие размеры");
			break;
		case "Неополитанская":
			System.out.println("У нас есть следующие размеры");
			break;
		case "Сицилийская":
			System.out.println("У нас есть следующие размеры");
			break;

		}
		return result;
	}

	public int size(int size) {
		int result = 0;

		switch (size) {

		case 20:
			System.out.println("Спасибо за заказ.");
			break;
		case 30:
			System.out.println("Спасибо за заказ.");
			break;
		case 40:
			System.out.println("Спасибо за заказ.");
			break;
		case 50:
			System.out.println("Спасибо за заказ.");
			break;

		}

		return result;
	}

	public String question(String d) {
		String result = "";

		switch (d) {

		case "да":
			System.out.println("У нас есть такие пиццы:");
			System.out.println("- Карпаччо");
			System.out.println("- 4 сезона");
			System.out.println("- Неополитанская");
			System.out.println("- Сицилийская");
			break;
		case "нет":
			System.exit(0);
			break;

		}

		return result;

	}

}
