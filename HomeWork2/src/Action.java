
public class Action {
	int x, y;
	
	public void setX(int X){
		x = X;
	}
	
	public void setY(int Y){
		y = Y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int sum(int x, int y){
		int fin = x + y;
		message_result(fin, x, y);
		return fin;
	}
	
	public int negativ(int x, int y){
		int fin = x - y;
		message_result(fin, x, y);
		return fin;
	}
	
	public int div(int x, int y){
		int fin = x / y;
		message_result(fin, x, y);
		return fin;
	}
	
	public int multi(int x, int y){
		int fin = x * y;
		message_result(fin, x, y);
		return fin;
	}
	
	private void message_result(int fin, int a, int b) {
		System.out.println("Результат: " + fin + ", " + "y = " + b);
		System.out.println();
	}
}
