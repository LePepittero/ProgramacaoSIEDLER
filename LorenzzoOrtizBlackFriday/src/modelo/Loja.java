/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Vanessa Ortiz
 */
public class Loja {
    private Integer l_id;
    private String l_name;
    private String l_opinion;
    

    public Integer getL_id() {
        return l_id;
    }

    public void setL_id(Integer l_id) {
        this.l_id = l_id;
    }


    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }


    public String getL_opinion() {
        return l_opinion;
    }

    public void setL_opinion(String l_opinion) {
        this.l_opinion = l_opinion;
    }
}