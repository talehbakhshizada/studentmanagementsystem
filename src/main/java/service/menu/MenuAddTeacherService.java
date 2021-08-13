/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import java.util.Scanner;
import service.menu.inter.MenuAddTeacherServiceInter;

/**
 *
 * @author 99451
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter{
        
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
        
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);
        
        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");
        
        
    }
}
