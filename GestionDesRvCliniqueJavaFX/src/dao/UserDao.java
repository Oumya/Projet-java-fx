/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import entities.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mbodj
 */
public class UserDao implements IDao{

    private final String  SQL_LOGIN = "SELECT * FROM user WHERE login =  ? AND password = ? ";
    private final DataBase database= new DataBase();
    
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
    public User findUserLoginAndPassword(String login,String password){
        User user = null;
        database.openConnexion();
        database.initPrepareStatement(SQL_LOGIN);
        try {
            database.getPs().setString(1, login);
            database.getPs().setString(2, password);
            ResultSet rs = database.executeSelect(SQL_LOGIN);
        
            if(rs.next())
            {
                    /*user = new User(
                    rs.getString("nom_complet"),
                    rs.getString("login"),
                    rs.getString("password"),
                    rs.getString("role") 
                    );*/
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

}
