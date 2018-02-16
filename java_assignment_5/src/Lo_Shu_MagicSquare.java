//Thanakorn Pasangthien Section1 6088109
import java.util.Arrays;
import java.util.Scanner;
public class Lo_Shu_MagicSquare {
	public static boolean MagicSquare(int[][] a) {
		boolean ismagic = false;
		int index;
		int sumrow;
		int sumcolum;
		int sumdiagonal1 = 0;
		int sumdiagonal2 = 0;
		int [] keep = new int[a.length];
		int [] keep1 = new int[a.length];
		int [] keep2 = new int[2];
		//sumrow
		for (int row = 0; row < a.length; row++) {
			sumrow = 0;
			index = 0;
			for (int i = 0; i < a.length; i++) {
				sumrow += a[index][i];
			}
			keep[row] = sumrow;
			index++;
		}
		//sumcolum
		for (int col = 0; col < a.length; col++) {
			sumcolum = 0;
			index = 0;
			for (int i = 0; i < a.length; i++) {
				sumcolum += a[i][index];
			}
			keep1[col] = sumcolum;
			index++;
		}
		//sumdiagonale1
		for (int i = 0,j=0; i < a.length&&j<a.length; i++,j++) {
			sumdiagonal1 += a[i][j];
			keep2[0] = sumdiagonal1;
		}
		//sumdiagonale2
		for (int i = 0,j=a.length-1; i < a.length&&j>=0; i++,j--) {
			sumdiagonal2 += a[i][j];
			keep2[1] = sumdiagonal1;
		}
		//check
		int count = 0;
		for (int i = 0; i < keep.length; i++) {
			if(keep[i]==keep1[i]) {
				count++;
			};
			
		}
		if(keep[0]==keep2[0]&&keep[0]==keep2[1]) {
				count += 2;
		}
		if(count == 5) {
			ismagic = true;
		}
		return ismagic;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] table = new int[3][3];
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		MagicSquare(table);
		if(MagicSquare(table)) {
			System.out.println("it's Magic");
		}else {
			System.out.println("it's not Magic");
		}
		
	}
}
