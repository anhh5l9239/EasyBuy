package cn.yunhe.entity;

import java.io.Serializable;

/**
 * 订单详情表
 */
public class OrderDetail implements Serializable {
    private int eodid;//订单详情编号
    private int eodquantity;//商品数量
    private Double eodcost;//单品金额
    private Order order;
    private Product product;

    public OrderDetail() {
    }

    public OrderDetail(int eodid) {
        this.eodid = eodid;
    }

    public OrderDetail(int eodid, int eodquantity, Double eodcost, Order order, Product product) {
        this.eodid = eodid;
        this.eodquantity = eodquantity;
        this.eodcost = eodcost;
        this.order = order;
        this.product = product;
    }

    public int getEodid() {
        return eodid;
    }

    public void setEodid(int eodid) {
        this.eodid = eodid;
    }

    public int getEodquantity() {
        return eodquantity;
    }

    public void setEodquantity(int eodquantity) {
        this.eodquantity = eodquantity;
    }

    public Double getEodcost() {
        return eodcost;
    }

    public void setEodcost(Double eodcost) {
        this.eodcost = eodcost;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
