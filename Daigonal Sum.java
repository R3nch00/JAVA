package com.company; 
public class Main{
    static void DiagonalSum(int M[][],int n){
        int p=0,s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    p+=M[i][j];
                if((i+j)==(n-1))
                    s+=M[i][j];
            }
        }
        System.out.println("P :"+p);
        System.out.println("S : "+s);
    }
    public static void main(String[] args){
        int o[][]={{1,5,3},{4,7,6},{1,8,9}};
        DiagonalSum(o,3);
    }
}