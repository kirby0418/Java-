
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/3); //println은 형식 지정 불가.
//		System.out.printf("%.2f\n", 10.0/3); //printf : 형식지정이 가능하다! 대신 개행은 스스로. \n
//		System.out.printf("%d", 15); //decimal number : 10진수로 출력 (%d)
		
		System.out.printf("[%5d]\n", 10);  //[   10]
		System.out.printf("[%-5d]\n", 10); //[10   ]
		System.out.printf("[%05d]\n", 10); //[00010]
		
		double d = 1.23456789;
		System.out.printf("%14.10f\n", d); //  1.2345678900
		System.out.printf("%14.6f\n", d); //      1.234568
		System.out.printf("%.6f\n", d); //1.234568
		
		System.out.printf("[%s]\n", "www.codechobo.com"); //[www.codechobo.com] 
		System.out.printf("[%20s]\n", "www.codechobo.com"); //[   www.codechobo.com] , 오른쪽 정렬(기본) 20자리
		System.out.printf("[%-20s]\n", "www.codechobo.com"); //[www.codechobo.com   ] ,왼쪽 정렬 20자리
		System.out.printf("[%.10s]\n", "www.codechobo.com"); //[www.codech] , 10자리로 자르기


		

	}

}
