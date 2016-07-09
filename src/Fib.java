
public class Fib {
	public static void main(String[] args) {
		int back2 = 1;
		int back1 = 1;
		int current;
		for (int i = 1; i < 10; i++) {
			current = back2 + back1;
			System.out.println(current);
			back2=back1;
			back1=current;
		}
	}
}
