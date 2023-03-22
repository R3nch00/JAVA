package com.company;
class GFG { 
    public static void main(String[] args) 
    { 
        StringBuffer s = new StringBuffer("Geeksfor"); 
        s.append("Geeks"); 
        System.out.println(s); // GeeksforGeeks 
        s.append(1); 
        System.out.println(s); // GeeksforGeeks1 
    } 
}