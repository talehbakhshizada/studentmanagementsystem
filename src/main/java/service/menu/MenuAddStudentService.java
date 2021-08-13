/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.inter.MenuAddStudentServiceInter;

/**
 *
 * @author 99451
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter{

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter name:");
        String name = sc.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("please enter surname:");
        String surname = sc2.nextLine();
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("please enter age:");
        int age = sc3.nextInt();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        
        Config.instance().appendStudent(s);
        System.out.println("student added");
        
        
    }
    
}
