//Thanakorn Pasangthien Section 1 6088109
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palindrome {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input;
		String newinput;
		System.out.println("Enter a word or phase to check if it is a palindrome:");
		input = br.readLine();
		newinput = input.toLowerCase().replaceAll(" ","");
		String reverse = "";
		int length = newinput.length();
		for (int i = length-1; i >=0; i--) {
			reverse += newinput.charAt(i); 
		}
		if(newinput.equals(reverse)) {
			System.out.println("The input "+input+" is a palindrome");
		}else {
			System.out.println("The input "+input+" is not a palindrome");
		}
	}
}
