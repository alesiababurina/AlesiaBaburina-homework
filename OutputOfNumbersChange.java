public class OutputOfNumbersChange {
    public static void main(String[] args) {
	int N = 1;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(" 3*" + N);
		N++;
            } else
                System.out.print(" " + i);

	}
    }
}