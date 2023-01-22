/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Person;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class PersonDAO {
    private String message = "";
    
    public String insertPerson(Connection conn, Person person){
        PreparedStatement pst = null;
        String sql = "CALL insertPerson(?,?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, person.getIdGender());
            pst.setInt(2, person.getIdAddress());
            pst.setInt(3, person.getIdUser());
            pst.setString(4, person.getDate());
            pst.setString(5,person.getPersonName());
            pst.setString(6,person.getPhoto());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Person inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Person not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String uodatePerson(Connection conn, Person person){
        PreparedStatement pst = null;
        String sql = "CALL updatePerosn(?,?,?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, person.getIdPerson());
            pst.setInt(2, person.getIdGender());
            pst.setInt(3, person.getIdAddress());
            pst.setInt(4, person.getIdUser());
            pst.setString(5, person.getDate());
            pst.setString(6,person.getPersonName());
            pst.setString(7,person.getPhoto());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Person inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Person not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }

    public String deletePerson(Connection conn, int idPerson){
        PreparedStatement pst = null;
        String sql = "CALL updatePerson(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idPerson);
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Person inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Person not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public DefaultTableModel getTable(Connection conn){
        String [] columns = {"ID Person", "ID Gender", "ID Adress", "idUser","Birthday","Name",
            "Photo", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getPerson(?,?)";
        
        String [] row = new String[11];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            while (rs.next()) {
                for (int i = 0; i < 11; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to show table playerPosition");

            System.out.println(e.getMessage());
        }
        return model;
    }
    
    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getPlayerPosition(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<Person> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                Person person = new Person();
                person.setIdPerson(rs.getInt(1));
                person.setIdGender(rs.getInt(2));
                person.setIdAddress(rs.getInt(3));
                person.setIdUser(rs.getInt(4));
                person.setDate(rs.getString(5));
                person.setPhoto(rs.getString(6));
                
                ObjectList.add(person);
            }
            System.out.println("Succesfully listed PlayerPosition");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get PlayerPosition list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }      
}
