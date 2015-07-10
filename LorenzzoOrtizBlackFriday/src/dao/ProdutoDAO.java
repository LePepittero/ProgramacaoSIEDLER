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
import modelo.Produto;

/**
 *
 * @author Vanessa Ortiz
 */
public class ProdutoDAO {

    public Boolean insert(Produto produto) {

        Boolean retorno;

        String sql = "INSERT INTO Produto (p_id,p_name, p_mark, p_info, p_price, p_blackprice, p_featured, p_pic) VALUES  (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setInt(1,produto.getP_id() );
            pst.setString(2, produto.getP_name());
            pst.setString(3, produto.getP_mark());
            pst.setString(4, produto.getP_info());
            pst.setDouble(5, produto.getP_price());
            pst.setDouble(6, produto.getP_blackprice());
            pst.setString(7, produto.getP_featured());
            pst.setBytes(8, produto.getP_pic());
            

            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {

            ex.printStackTrace();
            retorno = false;

        }

        return retorno;

    }

    public List<Produto> select() {

        List<Produto> lista = new ArrayList<Produto>();
        String sql = "SELECT * FROM PRODUTO";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {

            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Produto produto = new Produto();
                produto.setP_id(res.getInt("p_id"));
                produto.setP_name(res.getString("p_name"));
                produto.setP_mark(res.getString("p_mark"));
                produto.setP_info(res.getString("p_info"));
                produto.setP_price(res.getDouble("p_price"));
                produto.setP_blackprice(res.getDouble("p_blackprice"));
                produto.setP_featured(res.getString("p_featured"));
                produto.setP_pic(res.getBytes("p_pic"));

                lista.add(produto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public Boolean delete(Produto produto) {
        Boolean retorno;

        String sql = "DELETE FROM PRODUTO WHERE p_id = ?";

        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setInt(1, produto.getP_id());

            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }

        return retorno;
    }

    public Boolean update(Produto produto) {
        Boolean retorno;

        String sql = "UPDATE PRODUTO SET p_name = ?,p_mark= ?,p_info= ?,p_price= ?,p_blackprice= ?, p_featured = ?, p_pic = ? WHERE p_id = ?";

        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, produto.getP_name());
            pst.setString(2, produto.getP_mark());
            pst.setString(3, produto.getP_info());
            pst.setDouble(4, produto.getP_price());
            pst.setDouble(5, produto.getP_blackprice());
            pst.setString(6, produto.getP_featured());
            pst.setBytes(7, produto.getP_pic());
            pst.setInt(8, produto.getP_id());

            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }

        return retorno;
    }

}
