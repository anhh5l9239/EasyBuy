package cn.yunhe.entity;

import java.io.Serializable;

/**
 * 商品分类表
 */
public class ProductCategory implements Serializable {
    private  int epcid;//分类编号
    private String epcname;//分类名称
    private int epcpartentid;//父类编号

    public ProductCategory() {
    }

    public ProductCategory(int epcid) {
        this.epcid = epcid;
    }

    public ProductCategory(int epcid, String epcname, int epcpartentid) {
        this.epcid = epcid;
        this.epcname = epcname;
        this.epcpartentid = epcpartentid;
    }

    public int getEpcid() {
        return epcid;
    }

    public void setEpcid(int epcid) {
        this.epcid = epcid;
    }

    public String getEpcname() {
        return epcname;
    }

    public void setEpcname(String epcname) {
        this.epcname = epcname;
    }

    public int getEpcpartentid() {
        return epcpartentid;
    }

    public void setEpcpartentid(int epcpartentid) {
        this.epcpartentid = epcpartentid;
    }
}
