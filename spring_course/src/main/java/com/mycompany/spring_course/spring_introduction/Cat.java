
package com.mycompany.spring_course.spring_introduction;


public class Cat implements Pet {

    public Cat() {
        System.out.println("Constructor Cat is created!");
    }

     

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
    
    
}
