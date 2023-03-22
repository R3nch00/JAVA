package com.company;
class GFG { 
    public static void main(String[] args) 
    { 
        StringBuffer s = new StringBuffer("GeeksforGeeks"); 
        s.delete(0, 5); // it can delete bunch of char ( from i to j-1)
        System.out.println(s);
        s.deleteCharAt(7); // it can delete only one char which one is specified
        System.out.println(s);
    } 
}