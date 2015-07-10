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
public class Produto {
    private Integer p_id;
    private String p_name;
    private String p_mark;
    private String p_info;
    private Double p_price;
    private Double p_blackprice;
    private String p_featured;
    private byte[] p_pic;

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_mark() {
        return p_mark;
    }

    public void setP_mark(String p_mark) {
        this.p_mark = p_mark;
    }

    public String getP_info() {
        return p_info;
    }

    public void setP_info(String p_info) {
        this.p_info = p_info;
    }

    public Double getP_price() {
        return p_price;
    }

    public void setP_price(Double p_price) {
        this.p_price = p_price;
    }

    public Double getP_blackprice() {
        return p_blackprice;
    }

    public void setP_blackprice(Double p_blackprice) {
        this.p_blackprice = p_blackprice;
    }

    public String getP_featured() {
        return p_featured;
    }

    public void setP_featured(String p_featured) {
        this.p_featured = p_featured;
    }

    public byte[] getP_pic() {
        return p_pic;
    }

    public void setP_pic(byte[] p_pic) {
        this.p_pic = p_pic;
    }


    
}
