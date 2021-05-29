package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int row,column;
    Scanner sc = new Scanner(System.in);
    row=sc.nextInt();
    column=sc.nextInt();
    if(row!=column || row<=0 || column<=0)
    {
        System.out.println("No");
        System.exit(0);
    }
    int[][] matrix=new  int[row][row];
    for(int rowIndex=0;rowIndex<row;rowIndex++)
    {
        for(int columnIndex=0;columnIndex<row;columnIndex++)
        {
            matrix[rowIndex][columnIndex]=sc.nextInt();
        }
    }
    System.out.println(isUpperTriangularMatrix(matrix,row)?"Yes":"No");
    }

    private static boolean isUpperTriangularMatrix(int[][] matrix,int row) {
        for(int rowIndex=0;rowIndex<row;rowIndex++)
        {
            for(int columnIndex=0;columnIndex<row;columnIndex++)
            {
                if(columnIndex<rowIndex && matrix[rowIndex][columnIndex]!=0)
                    return false;
            }
        }
        return true;
    }
}
