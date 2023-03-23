package com.company; 
class Main{
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("RobertLewandowski");
        s.delete(0, 5);
        System.out.println(s); // tLewandowski
        s.deleteCharAt(7);
        System.out.println(s); // tLewandwski
    }
}