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
import modelo.Usuario;

/**
 *
 * @author Vanessa Ortiz
 */
public class UsuarioDAO {
    public boolean insert (Usuario usuario)
    {
        Boolean retorno;
        
        String sql = "INSERT INTO usuario(u_login,u_password, u_email)" + "VALUES (?, ?, ?)";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
        
            pst.setString(1, usuario.getU_login()); //esse 1 é a ordem dos parâmetros
            pst.setString(2, usuario.getU_password());
            pst.setString(3, usuario.getU_email());
           // pst.setBytes(4,usuario.getImagem());
          
            pst.executeUpdate();
            retorno = true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    } 
        public List<Usuario> select()
    {
        List <Usuario> lista = new ArrayList<Usuario>();
        String sql = "SELECT * FROM usuario";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        { 
            
            ResultSet res = pst.executeQuery();
           
            while (res.next())
            {
                Usuario usuario = new Usuario();
                usuario.setU_login(res.getString("u_login"));
                usuario.setU_password(res.getString("u_password"));
                usuario.setU_email(res.getString("u_email"));
              //usuario.setImagem(res.getBytes(sql));
                lista.add(usuario);
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
        public Boolean delete (Usuario usuario)
    {
        Boolean retorno;
        
        String sql = "DELETE FROM USUARIO WHERE U_LOGIN = ?";
        
        //Prepara a execução do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setString(1, usuario.getU_login());
            pst.executeUpdate();
            retorno = true;
        }
        
        catch (Exception ex)
        {
            retorno = false;         
        }
        
        return retorno;
    }
    
         public Boolean update (Usuario usuario)
    {
        Boolean retorno;
        
        String sql = "UPDATE USUARIO SET U_PASSWORD = ?, U_EMAIL = ? WHERE U_LOGIN = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setString(1, usuario.getU_password());
            pst.setString(2, usuario.getU_email());
            pst.setString(3, usuario.getU_login());
            //pst.setBytes(4,  usuario.getImagem());
            
            pst.executeUpdate();
            retorno = true;
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
         
         public Usuario login (Usuario usuario)
    {
        Usuario retorno = null;
        String sql = "SELECT * FROM USUARIO WHERE U_LOGIN = ? and U_PASSWORD = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setString(1, usuario.getU_login());
            pst.setString(2, usuario.getU_password());
            
            ResultSet res = pst.executeQuery();
            
            //se tiver um jogador com login e senha igual ao informado
            //preenche todos os campos
            
            if (res.next())
            {
                retorno = new Usuario();
                retorno.setU_email(res.getString("u_email"));
                retorno.setU_login(res.getString("u_login"));
                retorno.setU_password(res.getString("u_password"));
                //retorno.setImagem(res.getBytes(sql));
            }
        } 
        catch (Exception e) 
        {
            
        }
        
        return retorno;
    }
    
    
    
    
    
    
    }

