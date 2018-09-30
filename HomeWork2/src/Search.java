import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Search {
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	
	public void start(int sel){
		System.out.println();
		System.out.print("Сколько чисел ввести: ");
		int count = cou();
		int[] mas = new int[count];
		float[] mas_float = new float[count];
		if(sel<4)mas = arr(mas);
		else if(sel>3)mas_float = arr(mas_float);
		
		if(sel == 1)sel = search_max(mas, sel);
		else if(sel == 2)sel = search_min(mas, sel);
		else if(sel == 3)change_place(mas);
		else if(sel == 4)div_arr(mas_float);
		else if(sel == 5)new_arr_positiv(mas_float);
	}
	
	private int[] arr(int[] m){
		for(int i = 0; i < m.length; i++){
			try{
				m[i] = Integer.parseInt(read.readLine());
			}catch(IOException e){e.printStackTrace();}	
		}
		message(m);
		return m;
	}
	
	private float[] arr(float[] m){
		for(int i = 0; i < m.length; i++){
			try{
				m[i] = Float.parseFloat(read.readLine());
			}catch(IOException e){e.printStackTrace();}	
		}
		message(m);
		return m;
	}
	
	private int cou(){
		int count = 0;
		try{
			count = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return count;
	}
	
	private int search_max(int[] mas, int index){
		int x = index;
		int max = mas[0];
		for(int i = 0; i < mas.length; i++){
			if(max < mas[i]){
				max = mas[i];
				index = i;
			}
		}
		if(x==1)message(x, max);
		return index;
	}
	
	private int search_max(float[] mas, int index){
		double max = mas[0];
		for(int i = 0; i < mas.length; i++){
			if(max < mas[i]){
				max = mas[i];
				index = i;
			}
		}
		return index;
	}
	
	private int search_min(int[] mas, int index){
		int x = index;
		int min = mas[0];
		for(int i = 0; i < mas.length; i++){
			if(min > mas[i]){
				min = mas[i];
				index = i;
			}
		}
		if(x==2)message(x, min);
		return index;
	}
	
	private void change_place(int[] mas){
		int index_max = 0;
		int index_min = 0;
		index_max = search_max(mas, index_max);
		index_min = search_min(mas, index_min);
		
		int tmp = mas[index_max];
		mas[index_max] = mas[index_min];
		mas[index_min] = tmp;
		
		message(mas);
	}
	
	private void div_arr(float[] mas){
		int index_max = 0;
		index_max = search_max(mas, index_max);
		for(int i = 0; i<mas.length; i++) {
			mas[i] /= mas[index_max];
		}

		message(mas);
	}
	
	private int count_positiv_number(float[] m, int index){
		for(int i = 0; i<m.length; i++) {
			if(m[i] >= 0)index++;
		}
		return index;
	}
	
	private void new_arr_positiv(float[] mas){
		int count = 0;
		int j = 0;
		float sum = 0;
		float[] mas_float = new float[count_positiv_number(mas, count)];
		for(int i = 0; i<mas.length; i++) {
			if(mas[i] >= 0) {
				mas_float[j] = mas[i];
				sum = sum + mas_float[j] * mas_float[j];
				j++;
			}
		}
		
		System.out.println("Сумма квадратов: " + sum);
		message(mas_float);
	}
	
	private void message(int x, int m){
		if(x == 1){
			System.out.println("Максимальное значение " + m);
			System.out.println();
		}else if(x == 2){
			System.out.println("Минимальное значение " + m);
			System.out.println();
		}
	}
	
	private void message(int[] mas){
		System.out.println();
		for(int i = 0; i<mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}
	
	private void message(float[] mas){
		System.out.println();
		for(int i = 0; i<mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}
}
