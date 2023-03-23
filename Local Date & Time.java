package com.company;
import java.time.LocalDateTime; // for only Time(LocalTime) & only Date(LocalDate)
public class Main {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);// yyyy-mm-ddThh-min-sec
    }
}