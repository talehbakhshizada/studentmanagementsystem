/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;

/**
 *
 * @author 99451
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter password:");
        String password = sc2.nextLine();

        if (!(username.equals("user") && (password.equals("11111")))) {
            throw new IllegalArgumentException("user or password is incorrct");
        }
        Config.setLoggedIn(true);
    }

}
