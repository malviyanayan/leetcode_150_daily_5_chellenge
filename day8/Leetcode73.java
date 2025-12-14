package day8;

import java.util.ArrayList;

// solution description
//  when move forward
//     problem occurs -> 1, 2, 4, 0

// 1,2,3,4
// 0,2,4,0->0,0,0,0
// 0,1,3,5

// Imagine Algo
// find all zerows -> like {{0,1},{2,3}...}..dont update matrix 
// traverse on zerow map and then work on the matrix

public class Leetcode73 {
    public void setZeroes(int[][] matrix) {

        ArrayList<int[]> map = new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                if(matrix[i][j]==0)map.add(new int[]{i, j});
            
        

        for(int[] next : map){
            int i = next[0];
            int j = next[1];

            for(int k = 0;k < matrix[0].length; k++)
                matrix[i][k] = 0;
            
            for(int k = 0;k < matrix.length; k++)
                matrix[k][j] = 0;

        }
    }

}
