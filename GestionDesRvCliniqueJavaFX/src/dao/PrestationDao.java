/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author mbodj
 */





public class PrestationDao implements IDao{
    
   DataBase dataBase = new DataBase();
   private final String  SQL_FIND_PRESTATION_BY_ID = "select  from prestation where id = ?";

    @Override
    public int insert(Object ogj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Object ogj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void findByNci(int patient_nci)
    {
        
    }
      
   
}

    

