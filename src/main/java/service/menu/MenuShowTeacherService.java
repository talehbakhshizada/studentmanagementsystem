/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.menu.inter.MenuShowTeacherServiceInter;

/**
 *
 * @author 99451
 */
public class MenuShowTeacherService implements MenuShowTeacherServiceInter{
    
    @Override
    public void process() {
       Teacher [] all = Config.instance().getTeachers();
          for (Teacher all1 : all) {
              System.out.println(all1);
          }
    }
    
}
