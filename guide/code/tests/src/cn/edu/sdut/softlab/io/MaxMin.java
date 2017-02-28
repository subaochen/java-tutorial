package cn.edu.sdut.softlab.io;

import java.util.Scanner;

/**
 * 输出较大的数
 */
public class MaxMin {
    public static void main(String[] args) {

        // first value read initialized min and max
        Scanner stdIn = new Scanner(System.in);
        int max = stdIn.nextInt();
        int min = max;

        // read in the data, keep track of min and max
        while (!stdIn.hasNext()) {
            int value = stdIn.nextInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }

        // output
        System.out.println("maximum  = " + max + ", minimum = " + min);
    }
}
