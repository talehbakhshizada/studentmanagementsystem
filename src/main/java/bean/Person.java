/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;


/**
 *
 * @author 99451
 */
public abstract class Person implements Serializable {
    
   String name;
   String surname;
   int age;
   
     Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

     Person() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     @Override
    public String toString(){
        return name + " "+ surname+" "+age;
    }

  
}
