/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Loja;
import modelo.Produto;

/**
 *
 * @author Vanessa Ortiz
 */
public class LojaDAO {

    public Boolean insert(Loja loja) {

        Boolean retorno;

        String sql = "INSERT INTO LOJA (l_id, l_name, l_opinion) VALUES  (?, ?, ?)";

        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setInt(1, loja.getL_id());
            pst.setString(2, loja.getL_name());
            pst.setString(3, loja.getL_opinion());

            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {

            ex.printStackTrace();
            retorno = false;

        }

        return retorno;

    }

    public List<Loja> select() {

        List<Loja> lista = new ArrayList<Loja>();
        String sql = "SELECT * FROM LOJA";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {

            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Loja loja = new Loja();
                loja.setL_id(res.getInt("l_id"));
                loja.setL_name(res.getString("l_name"));
                loja.setL_opinion(res.getString("l_opinion"));

                lista.add(loja);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
        public List<Loja> selectRecomendadas() {

        List<Loja> lista = new ArrayList<Loja>();
        String sql = "SELECT * FROM LOJA WHERE L_OPINION = 'Sim'";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {

            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Loja loja = new Loja();
                loja.setL_id(res.getInt("l_id"));
                loja.setL_name(res.getString("l_name"));
                loja.setL_opinion(res.getString("l_opinion"));

                lista.add(loja);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
        
    }
        
        public List<Loja> selectRecomendadaso() {

        List<Loja> lista = new ArrayList<Loja>();
        String sql = "SELECT * FROM LOJA WHERE L_OPINION = 'Sim'  ORDER BY L_NAME";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {

            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Loja loja = new Loja();
                loja.setL_id(res.getInt("l_id"));
                loja.setL_name(res.getString("l_name"));
                loja.setL_opinion(res.getString("l_opinion"));

                lista.add(loja);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
        
    }
 public List<Loja> selectR() {

        List<Loja> lista = new ArrayList<Loja>();
        String sql = "SELECT * FROM LOJA WHERE L_OPINION = 'Sim'  ORDER BY L_NAME";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {

            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Loja loja = new Loja();
                loja.setL_id(res.getInt("l_id"));
                loja.setL_name(res.getString("l_name"));
                loja.setL_opinion(res.getString("l_opinion"));

                lista.add(loja);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
        
    }
 
 
    public List<Loja> selectR2() {

        List<Loja> lista = new ArrayList<Loja>();
        String sql = "SELECT * FROM LOJA WHERE L_OPINION = 'Sim'  ORDER BY L_NAME DESC";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {

            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Loja loja = new Loja();
                loja.setL_id(res.getInt("l_id"));
                loja.setL_name(res.getString("l_name"));
                loja.setL_opinion(res.getString("l_opinion"));

                lista.add(loja);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
        
    }
    public Boolean delete(Loja loja) {
        Boolean retorno;

        String sql = "DELETE FROM LOJA WHERE l_id = ?";

        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setInt(1, loja.getL_id());

            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }

        return retorno;
    }
    
    
    public Boolean update(Loja loja) {
        Boolean retorno;

        String sql = "UPDATE LOJA SET l_name = ? , l_opinion = ? WHERE l_id = ?";

        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setInt(3, loja.getL_id());
            pst.setString(1, loja.getL_name());
            pst.setString(2, loja.getL_opinion()); 
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }

        return retorno;
    }
    
        public static List <Loja> Lojaordem()
     {
         List<Loja> lista = new ArrayList<Loja>();
         String sql = "SELECT  * FROM LOJA WHERE L_OPINION = 'sim' ORDER BY L_NAME";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         try {
             
         
         ResultSet res = pst.executeQuery();
         
         while (res.next())
         {
             Loja loja = new Loja();
             loja.setL_id(res.getInt("l_id"));
             loja.setL_name(res.getString("l_name"));
             loja.setL_opinion(res.getString("l_opinion"));
             lista.add(loja); 
         }
     }catch (SQLException ex){
            ex.printStackTrace();
}
     return lista;
     
     }
        
        
        public static List <Loja> Lojaordemd()
     {
         List<Loja> lista = new ArrayList<Loja>();
         String sql = "SELECT  * FROM LOJA WHERE L_OPINION = 'sim' ORDER BY L_NAME DESC";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         try {
             
         
         ResultSet res = pst.executeQuery();
       
         while (res.next())
         {
             Loja loja = new Loja();
             loja.setL_id(res.getInt("l_id"));
             loja.setL_name(res.getString("l_name"));
             loja.setL_opinion(res.getString("l_opinion"));
             lista.add(loja); 
         }
     }catch (SQLException ex){
            ex.printStackTrace();
}
     return lista;
     
     }
}
