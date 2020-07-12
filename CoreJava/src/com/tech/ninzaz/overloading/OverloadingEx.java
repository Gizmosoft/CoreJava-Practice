package com.tech.ninzaz.overloading;

class First{
    void display(){
        System.out.println("First");
    }
}

class Second{
    void display(){
        System.out.println("Second");
    }
}

public class OverloadingEx{

     public static void main(String []args){
        First obj1 = new First();
        Second obj2 = new Second();
        First ref;
        ref = obj1;
        ref.display();
//        ref = obj2;
//        ref.display();
        
     }
}