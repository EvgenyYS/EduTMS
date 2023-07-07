package Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HW1
    //       3D ARRAY
{
    public static void main(String[] args) {
        int[][][] a = {
                {
                        {1, 4, 2}, {5, 0, 8}
                },
                {
                        {9, 2, 6}, {3, 2, 0}, {6, 2, 8}}
        };
        System.out.println(Arrays.deepToString(a));
        int x; // variable for incremental
        System.out.println("Please enter incremental: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                for (int f = 0; f < a[i][j].length - 1; f++) {
                    a[i][j][f] += x;
                }
            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                for (int f = 0; f < a[i][j].length - 1; f++) {
                    System.out.println(Arrays.deepToString(a));
                }
                System.out.println();
            }
        }


    }
}
