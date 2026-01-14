public class main {
	
	static void getSum() {
		long sum = 0;

		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			sum += i;
			System.out.printf("%d -> %d -> %d\n", i, sum, getDivs(sum));
			if (getDivs(sum) >= 500) break;
		}
	}

	static int getDivs(long number) {
		int amnt = 0;
		for (int i = 1; i * i <= number; i++) {
			if (i * i == number) amnt--;
			if (number % i == 0) amnt+=2;
		}
		return amnt;
	}

	public static void main(String[] args) {
		getSum();
	}
}
