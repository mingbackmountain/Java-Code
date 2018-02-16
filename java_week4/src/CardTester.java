//Thanakorn Pasangthien Section1 6088109
import java.util.Scanner;
public class CardTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//method 1
		/*for (int i = 0; i < 3; i++) {
			String x;
			System.out.print("Please input:");
			x = sc.nextLine();
			Card test = new Card(x);
			System.out.println(test.getDescription());
		}*/
		//method2
		String x = null;
		while(true) {
			System.out.print("Please input('q' to end):");
			x = sc.nextLine();
			Card test = new Card(x);
			if(x.equals("q")) {
				System.out.println("Thank you! Bye!");
				break;
			}else {
				System.out.println(test.getDescription());
				continue;
			}
		}
	}
}
