import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkFromBook {
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	
	public void start(int sel) {
		if(sel == 1)different_sequence();
		else if(sel == 2)matrix();
		else if(sel == 3)roots();
		else if(sel == 4)month();
	}
	
	private double input() {
		double a = 0;
		try {
			a = Double.parseDouble(read.readLine());
		}catch(IOException e) {e.printStackTrace();}
		
		return a;
	}
	
	private void different_sequence() {
		System.out.println();
		System.out.print("Введите значение левой границы: ");
		int a = (int) (input());
		System.out.print("Введите значение правой границы: ");
		int b = (int) (input());
		System.out.print("Введите значение, которое хотите проверить: ");
		int x = (int) (input());
		
		border(a, b, x);
	}
	
	private void border(int a, int b, int x) {
		boolean select_one = false;
		boolean select_two = false;
		boolean select_three = false;
		boolean select_four = false;
		
		if(a <= x && x <= b) {select_one = true;}
		if(a < x && x < b) {select_two = true;}
		if(a < x && x <= b) {select_three = true;}
		if(a <= x && x < b) {select_four = true;}
		
		message_sequence(select_one, select_two, select_three, select_four);
	}
	
	private void message_sequence(boolean a, boolean b, boolean c, boolean d) {
		System.out.println();
		if(a == true)System.out.println("X входит в промежуток:  [a, b]");
		else System.out.println("X не входит в промежуток:  [a, b]");
		if(b == true)System.out.println("X входит в промежуток:  (a, b)");
		else System.out.println("X не входит в промежуток:  (a, b)");
		if(c == true)System.out.println("X входит в промежуток:  (a, b]");
		else System.out.println("X не входит в промежуток:  (a, b]");
		if(d == true)System.out.println("X входит в промежуток:  [a, b)");
		else System.out.println("X не входит в промежуток:  [a, b)");
		System.out.println();
	}
	
	private void matrix() {
		System.out.println();
		System.out.print("Последовательность чисел от 1 до: ");
		int a = (int) (input());
		int[][] mas = new int[a][a];
		mas = input(mas);
		conclusion(mas);
	}
	
	private int[][] input(int mas[][]) {
		int count = 1;
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				mas[i][j] = count;
				count++;
			}
			count++;
		}
		return mas;
	}
	
	private void conclusion(int mas[][]) {
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j]);
			}
			System.out.println();
		}
	}
	
	private void roots() {
		System.out.println();
		System.out.print("Введите a: ");
		double a = input();
		System.out.print("Введите b: ");
		double b = input();
		System.out.print("Введите c: ");
		double c = input();
		double d = search_d(a, b, c);
		
		check_d(d, a, b, c);
	}
	
	private double search_d(double a, double b, double c) {
		return b * b - 4 * a * c;
	}
	
	private void check_d(double d, double a, double b, double c) {
		if(d > 0) {d_more_null(d, a, b);}
		else if(d == 0) {d_equals_null(a, b, c);}
		else if(d < 0) {message_d(0, 0);}
	}
	
	private void d_equals_null(double a, double b, double c) {
		double x = -1 * b  / 2 * a;
		message_d(x, 0);
	}
	
	private void d_more_null(double d, double a, double b) {
		double d1 = d;
		double a1 = a;
		double b1 = b;
		double x1 = ((b1 - Math.sqrt(d1)) / 2 * a1);
		double x2 = ((b1 + Math.sqrt(d1)) / 2 * a1);
		
		message_d(x1, x2);
	}
	
	private void message_d(double x1, double x2) {
		if(x1 != 0 && x2 != 0)System.out.println("Корни уравнения: " + "x1 = " + x1 + ", " + "x2 = " + x2);
		else if(x1 != 0 && x2 == 0)System.out.println("Корень уравнения: " + "x1 = " + x1);
		else if(x1 == 0 && x2 == 0)System.out.println("Нет корней");
		System.out.println("");
	}
	
	private void month() {
		System.out.println();
		boolean s = true;
		int num_month = 0;
		while(s) {
			System.out.print("Введите номер месяца: ");
			num_month = (int) (input());
			if(num_month < 1 || num_month > 12) {
				System.out.println("Введите номер месяца еще раз, так вы выбрали не существующий номер: ");
			}else s = false;
		}
		select_month(num_month);
	}
	
	private void select_month(int num) {
		switch(num) {
			case 1: System.out.println("Январь"); break;
			case 2: System.out.println("Февраль"); break;
			case 3: System.out.println("Март"); break;
			case 4: System.out.println("Апрель"); break;
			case 5: System.out.println("Май"); break;
			case 6: System.out.println("Июнь"); break;
			case 7: System.out.println("Июль"); break;
			case 8: System.out.println("Август"); break;
			case 9: System.out.println("Сентябрь"); break;
			case 10: System.out.println("Октябрь"); break;
			case 11: System.out.println("Ноябрь"); break;
			case 12: System.out.println("Декабрь"); break;
		}
	}
	
}
