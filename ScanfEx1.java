import java.util.*; //1. import¹® Ãß°¡
public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

//		int num = scanner.nextInt();
//		int num_2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num_2);
		
		String input = scanner.nextLine(); //line단위로 입력받기
		int num_3 = Integer.parseInt(input);
		System.out.println(num_3);
	}

}
