/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import B_Layer.*;
import Entities.*;

/**
 *
 * @author jox
 */
public class TestBO {
    UserBO userBO = new UserBO();
    User user = new User();
    String message = "";
    
    DemonymBO demoBO = new DemonymBO();
    Demonym demo = new Demonym();
    
    public void insert(){
        demo.setNameDemonym("Prueba");
        message = demoBO.insertDemonym(demo);  
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
        message = demoBO.deleteDemonym(idUser);  
        System.out.println(message);
    }
    public void get(){
        demoBO.getDemonym();
    }
    
    public User verify(){
        user.setUsername("brenda");
        user.setPassword("28");
        return userBO.verifyUser(user);
    }
    
    public static void main(String[] args) {
        TestBO test = new TestBO();
        test.get();
    }
}


