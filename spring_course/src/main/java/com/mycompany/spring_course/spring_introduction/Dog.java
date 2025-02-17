
package com.mycompany.spring_course.spring_introduction;


public class Dog implements Pet {

    public Dog() {
        System.out.println("Constructor Dog is created!");
    }


    
    @Override
    public void say(){
        System.out.println("Bouw-Weou");
    }
    
}
