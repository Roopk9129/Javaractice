package Practice;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
        int[] input = {7, 11, 14};
        

        int min = input[0];
        int max = input[input.length - 1];

        for (int i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }
    }

}
