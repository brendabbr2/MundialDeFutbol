/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import B_Layer.UserBO;
import Entities.User;

/**
 *
 * @author jox
 */
public class TestBO {
    UserBO userBO = new UserBO();
    User user = new User();
    String message = "";
    
    public void insert(){
        user.setIdUserType(1);
        user.setUsername("joxan");
        user.setPassword("123");
        message = userBO.insertUser(user);  
        System.out.println(message);
    }
    
    public void update(){
        user.setIdUser(1);
        user.setIdUserType(1);
        user.setUsername("brenda");
        user.setPassword("258");
        message = userBO.updateUser(user);  
        System.out.println(message);
    }
    public void delete(int idUser){
        message = userBO.deleteUser(idUser);  
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        TestBO test = new TestBO();
        test.delete(2);
    }
}


