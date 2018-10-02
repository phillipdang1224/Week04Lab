/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 747787
 */
public class UserService {

    public User login(String username, String password) {
        if (((username.equals("adam")) && password.equals("password"))) {
            password = null;
            User user = new User(username, password);
            return user;
        } else if (((username.equals("betty")) && password.equals("password"))) {
            password = null;
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }

    }

}
