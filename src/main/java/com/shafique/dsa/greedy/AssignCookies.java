package com.shafique.dsa.greedy;

import java.util.Arrays;

public class AssignCookies {
    public static void main ( String[] args ) {
        int[] studentGreedyFactor = {1, 2, 3};
        int[] cookySize = {1, 1};
        System.out.println (AssignCookies.countOfSatisfiedStudent ( studentGreedyFactor
                , cookySize ) );
        
    }
    
    private static int countOfSatisfiedStudent(int[] greedyStudent, int[] cookySize){
        if(greedyStudent == null || greedyStudent.length == 0 || cookySize == null || cookySize.length == 0){
            return 0;
        }
        
        Arrays.sort ( greedyStudent );
        Arrays.sort ( cookySize );
        
        int i = 0, j = 0;
        while(i < greedyStudent.length && j < cookySize.length){
            if(cookySize[i] >= greedyStudent[i] ){
                i++;
            }
            j++;
        }
       return i;
    }
}
