package week2;

public class DataType {

	public static void A(int n) {
		if(n > 0) {
//			A(n -1);
			System.out.println(" " + n);
			A(n -1);
		}
	}
	public static void main(String[] args) {
		A(3);
	}
}