package com.company;
class GFG { 
    public static void main(String[] args) 
    { 
        StringBuffer s = new StringBuffer("GeeksforGeeks"); 
        s.replace(5, 8, "are"); // (int start,int end, String str)
        System.out.println(s); 
    } 
}