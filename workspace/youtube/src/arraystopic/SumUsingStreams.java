package arraystopic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumUsingStreams {
	public static void main(String[] args) {
		// # 5 Different ways to sum all elements in an array in java8
		int[] a = { 10, 20, 30, 40, 50 };
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);

		System.out.println("--------------");

		int sum1 = IntStream.of(a).sum();
		System.out.println(sum1);
		System.out.println("--------------");

		int sum2 = Arrays.stream(a).reduce((x, y) -> x + y).getAsInt();
		System.out.println(sum2);
		System.out.println("--------------");

		int sum3 = Arrays.stream(a).reduce(Integer::sum).getAsInt();
		System.out.println(sum3);
		System.out.println("--------------");

		long sum4 = Arrays.stream(a).summaryStatistics().getSum();
		System.out.println(sum4);
	}
}
