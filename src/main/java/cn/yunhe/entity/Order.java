package cn.yunhe.entity;

import java.io.Serializable;

/**
 * 订单表
 */
public class Order implements Serializable {
    private int eoid;//订单id;
    private Double eccost;//本单金额
    private User user;//

    public Order(int eoid, Double eccost, User user) {
        this.eoid = eoid;
        this.eccost = eccost;
        this.user = user;
    }

    public Order() {
    }

    public Order(int eoid) {
        this.eoid = eoid;
    }
}
