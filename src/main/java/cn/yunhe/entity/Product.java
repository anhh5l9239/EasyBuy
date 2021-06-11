package cn.yunhe.entity;

import java.io.Serializable;

/**
 * 商品表
 */
public class Product implements Serializable {
    private int epid;//商品编号
    private String epname;//商品名称
    private String epdesc;//商品描述
    private Double price;//商品价格
    private int epstock;//商品库存
    private String eppicturename;//商品图片名称
    private ProductCategory productCategory;

    public Product() {
    }

    public Product(int epid) {
        this.epid = epid;
    }

    public Product(int epid, String epname, String epdesc, Double price, int epstock, String eppicturename, ProductCategory productCategory) {
        this.epid = epid;
        this.epname = epname;
        this.epdesc = epdesc;
        this.price = price;
        this.epstock = epstock;
        this.eppicturename = eppicturename;
        this.productCategory = productCategory;
    }

    public int getEpid() {
        return epid;
    }

    public void setEpid(int epid) {
        this.epid = epid;
    }

    public String getEpname() {
        return epname;
    }

    public void setEpname(String epname) {
        this.epname = epname;
    }

    public String getEpdesc() {
        return epdesc;
    }

    public void setEpdesc(String epdesc) {
        this.epdesc = epdesc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getEpstock() {
        return epstock;
    }

    public void setEpstock(int epstock) {
        this.epstock = epstock;
    }

    public String getEppicturename() {
        return eppicturename;
    }

    public void setEppicturename(String eppicturename) {
        this.eppicturename = eppicturename;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
