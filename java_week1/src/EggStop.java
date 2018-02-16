public class EggStop {
	public static void eggHead() {
		System.out.println("  "+"-------------- ");
		System.out.println(" /"+"              "+"\\");
		System.out.println("/"+"              "+"  \\");
	}
	public static  void eggStop() {
		System.out.println("|     STOP       |");
	}
	public static void eggBottom() {
		System.out.println("\\"+"              "+"  /");
		System.out.println(" \\"+"              "+"/");
		System.out.println(" "+" -------------- ");
	}
	public static void main(String[] args) {
		eggHead();
		eggBottom();
		System.out.println();
		eggHead();
		eggBottom();
		System.out.println("+-----------------+");
		eggHead();
		eggStop();
		eggBottom();
	}
}
