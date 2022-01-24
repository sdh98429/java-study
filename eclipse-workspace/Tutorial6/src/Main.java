
public class Main {
	final static int N = 30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int score = 85;
//		
//		if(score >= 90) {
//			System.out.println("A+입니다");
//		}
//		else if(score >= 80) {
//			System.out.println("B+입니다");
//		}
//		else {
//			System.out.println("C+입니다");
//		}
		
//		String a = "Man";
//		int b = 0;
//		// 자바는 String을 비교할 때 equal()을 이용한다.
//		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문
//		if (a.equals("Man")) {
//			System.out.println("남자입니다.");
//		}
//		
//		if (b==3) {
//			System.out.println("b는 3입니다");
//		}
//		
//		if (a.equalsIgnoreCase("man")) {
//			System.out.println("남자입니다.");
//		}
		
//		int i = 1, sum = 0;
//		while (i <= 1000) {
//			sum += i++;
//		}
//		System.out.println(sum);
		
//		// for 문 : 초기화 부분, 조건 부분, 연산 부분
//		for (int i = N; i > 0; i--) {
//			for (int j = i; j>0 ; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = -N; i<=N; i++) {
//			for (int j=-N; j<=N; j++) {
//				if (i * i + j * j <= N * N) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		int count = 0;
		
		for(;;)
		{
			System.out.println("출력");
			count++;
			if (count==10) {
				break;
			}
		}
	}

	
}
