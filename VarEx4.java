package ch02;

public class VarEx4 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp;
		
		tmp = x;  //tmp�� x�� �� 10 ����
		x = y;  //x�� y�� �� 20 ����
		y = tmp; // y�� tmp�� �� 10 ����
		
		System.out.println(x); //20 
		System.out.println(y); //10
		System.out.println(tmp); //10
	}

}
