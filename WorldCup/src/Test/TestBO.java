/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import B_Layer.*;
import Entities.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
    private static byte[] hash;
            
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
    
    
    public static byte[] getHash(String password) throws NoSuchAlgorithmException{
        MessageDigest messageDisgest = MessageDigest.getInstance("SHA-256");
        return hash = messageDisgest.digest(password.getBytes(StandardCharsets.UTF_8));
    }
    
    public static void byteToHex(String password) throws NoSuchAlgorithmException{
        System.out.println(Hash(getHash(password)));
    }
    
    public static String Hash(byte[] hash){
        StringBuffer hexString = new StringBuffer();
        for(int i = 0; i < hash.length; i++){
            String hex = Integer.toHexString(255 & hash[i]);
            if(hex.length() == 1){
                hexString.append('0');
            }
            hexString.append(hex);
        }
        //System.out.println(hexString);
        return hexString.toString();
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        byteToHex("ds");
    }
}


