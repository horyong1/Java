package Q02;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 == 0) {
				sum += i;
				System.out.println(i+" "+sum);
			}
		}
		System.out.println(sum);
	}
}
