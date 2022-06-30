package corejava.com.demo.streamsjava8;

import java.util.Arrays;
//IntStream demo
public class StreamtoArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 45 };
		Integer[] result = Arrays.stream(num).map(x -> x * 2).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.asList(result));

	}

}
