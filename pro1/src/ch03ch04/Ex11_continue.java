package ch03ch04;
/**
 * continue
 * */
public class Ex11_continue {
	public static void main(String[] args) {

		for(int i = 0; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println("i = " + i);
		}

		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("i = " + i);
		}
		
	}
}
