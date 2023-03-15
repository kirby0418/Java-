package ch02;

public class VarEx3 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(tmp);
	}

}
