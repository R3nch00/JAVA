package com.company; 
class Bank  
{ 
    private String name; 
    Bank(String name) 
    { 
        this.name = name; 
    }       
    public String getBankName() 
    { 
        return this.name; 
    } 
}   
class Employee 
{ 
    private String name;  
    Employee(String name)  
    { 
        this.name = name; 
    }       
    public String getEmployeeName() 
    { 
        return this.name; 
    }  
} 
class Main
{ 
    public static void main (String[] args)  
    { 
        Bank bank = new Bank("Axis"); 
        Employee emp = new Employee("Neha");         
        System.out.println(emp.getEmployeeName() +  
               " is employee of " + bank.getBankName()); 
    } 
}
//
package com.company; 
class Student
{
    private String name;
    private int age;
    private String gender;
    Student(String name,int age,String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
}
class Passport
{
    private String name;
    private String country;
    private String seat_type;
    private String boarding_time;
    private String visa_type;

    Passport(String name,String country,String seat_type,String boarding_time,String visa_type)
    {
        this.name=name;
        this.country=country;
        this.seat_type=seat_type;
        this.boarding_time=boarding_time;
        this.visa_type=visa_type;
    }
    public String getLastName()
    {
        return this.name;
    }
    public String getCountry() {
        return this.country;
    }
    public String getSeat_type(){
        return this.seat_type;
    }
    public String getBoarding_time(){
        return this.boarding_time;
    }
    public String getVisa_type(){
        return this.visa_type;
    }
}
class Main
{
    public static void main (String[] args)
    {
        Student a1 = new Student("Paul",25,"Male");
        Passport a2 = new Passport("Pogba","France","Business Class","21-4-2021","Student Visa");
        System.out.print("Name:"+ a1.getName()+" "+a2.getLastName()+"\n");
        System.out.print("Age:"+a1.getAge()+"\n");
        System.out.print("Gender:"+a1.getGender()+"\n");
        System.out.print("Birth Place:"+a2.getCountry()+"\n");
        System.out.print("Seat Type:"+a2.getSeat_type()+"\n");
        System.out.print("Arrival Time:"+a2.getBoarding_time()+"\n");
        System.out.print("Visa Type:"+a2.getVisa_type()+"\n");
    }
}