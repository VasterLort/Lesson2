import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Menu {
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	
	public void realizaition(){	
		Action act = new Action();
		Search search = new Search();
		HomeWorkFromBook hwfb = new HomeWorkFromBook();
		int control = 0;
		int finish = 0;
		
		while(control!=20){
			control = select(control);
			check(control, finish, act);
			
			if(control == 1)finish = act.sum(act.x, act.y);
			else if(control == 2)finish = act.negativ(act.x, act.y);
			else if(control == 3)finish = act.div(act.x, act.y);
			else if(control == 4)finish = act.multi(act.x, act.y);
			else if(control == 5)input_y(act, finish);
			else if(control == 6)null_values(act, finish);
			else if(control == 7)search.start(1);
			else if(control == 8)search.start(2);
			else if(control == 9)search.start(3);
			else if(control == 10)search.start(4);
			else if(control == 11)search.start(5);
			else if(control == 12)hwfb.start(1);
			else if(control == 13)hwfb.start(2);
			else if(control == 14)hwfb.start(3);
			else if(control == 15)hwfb.start(4);
			act.x = finish;
		}
	}
	
	private int select(int cont){
		System.out.println();
		//�����������
		System.out.println("1 - ��������" );
		System.out.println("2 - ���������" );
		System.out.println("3 - �������" );
		System.out.println("4 - ���������" );
		System.out.println("5 - ������� ����� y" );
		System.out.println("6 - �������� ��������" );
		//����� ������������� � ������������� � �������
		System.out.println("7 - ����� �������������" );
		System.out.println("8 - ����� ������������" );
		//�� �� �����: Lesson 2 HW:
		System.out.println("9 - �������� ������� max � min" );
		System.out.println("10 - Normal / max � �������" );
		System.out.println("11 - ������������ ������ B �� ������������� ��������� ������� A" );
		//�� �� �����
		System.out.println("12 - ���������� �������������� ���������� �������� k ���������� (n, m], [n, m), (n, m), [n, m]" );
		System.out.println("13 - ������� ����� �� 1 �� k � ���� ������� N x N ����� ������� � ������ ����" );
		System.out.println("14 - ����� ����� ����������� ���������" );
		System.out.println("15 - ������ ����� �� 1 �� 12. ������� �� ������� �������� ������, ���������������� ������� �����." );
		System.out.println("20 - �����" );
		return cont = controler();
	}
	
	private int controler(){
		int c = 0;
		try{
			c = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}	
		return c;
	}
	
	private void check(int control, int finish, Action act) {
		if(control<7 && finish == 0) {
			System.out.println();
			System.out.println("������� ��� �����: ");
			first_input(act);
		}
	}
	
	private void null_values(Action act, int finish) {
		act.x = 0;
		act.y = 0;
		finish = 0;
		System.out.println();
		System.out.println("������� ����� �������� ");
		first_input(act);
	}
	
	private void first_input(Action act){
		try{
			System.out.print("x: ");
			act.x = Integer.parseInt(read.readLine());
			System.out.print("y: ");
			act.y = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}
	}
	
	private void input_y(Action act, int finish){
		try{
			System.out.print("y: ");
			act.y = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		message_new_value(finish, act.getX(), act.getY());
	}
	
	private void message_new_value(int fin, int a, int b) {
		System.out.println("���������: " + fin + ", " + "y = " + b);
		System.out.println();
	}
}
