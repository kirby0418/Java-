package ch02;

public class VarEx4 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp;
		
		tmp = x;  //tmp에 x의 값 10 저장
		x = y;  //x에 y의 값 20 저장
		y = tmp; // y에 tmp의 값 10 저장
		
		System.out.println(x); //20 
		System.out.println(y); //10
		System.out.println(tmp); //10
	}

}
