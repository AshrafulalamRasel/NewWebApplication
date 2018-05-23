/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbr.springmvc.service;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

/**
 *
 * @author DIU
 */
public interface UserService {

    void register(User user);

    User validateUser(Login login);

}
