import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���: ");
//		int i = sc.nextInt();
//		System.out.println("�Էµ� ������ " + i + "�Դϴ�.");
//		sc.close();
		
		File file = new File ("input.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ �о���� ���߿� ���� �߻�");
		}
	}

}