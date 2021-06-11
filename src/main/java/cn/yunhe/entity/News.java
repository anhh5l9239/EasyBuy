package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 新闻
 */
public class News implements Serializable {
    private int enid;//新闻ID
    private String entitle;//新闻标题
    private String encontext;//新闻内容
    private Date encreatetime;//新闻发布时间
}
