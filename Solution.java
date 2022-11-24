import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int multiDimArr[][] = new int[6][6];
        for(int row = 0; row < 6; row++){
            for(int col = 0; col < 6;col++){
                multiDimArr[row][col] = sc.nextInt();
            }
        }
        System.out.println(Solve(multiDimArr));
    }
    static int Solve(int arr[][]){
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int row = 0; row < 4; row++){
            
            for(int col = 0; col < 4; col++ ){
                
                total = arr[row][col] + arr[row][col+1] + arr[row][col+2];
                total += arr[row+1][col+1];
                total += arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                max = total>max?total:max;
            }
        }
        return max;
        
    }

}

