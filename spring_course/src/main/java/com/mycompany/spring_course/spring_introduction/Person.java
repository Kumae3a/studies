
package com.mycompany.spring_course.spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Constructor Person is created!");
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet! ");
        this.pet = pet;
    }
    
    
    
    
}
