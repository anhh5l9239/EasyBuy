package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论表 Comment
 */
public class Comment implements Serializable {
    private  int ecid;//评论编号id
    private String eccontext;//评论内容
    private Date eccreatetime;//评论增加时间
    private  String ecreply;//评论回复
    private Date ecreplytime;//评论回复时间
    private User user;

    public int getEcid() {
        return ecid;
    }

    public void setEcid(int ecid) {
        this.ecid = ecid;
    }

    public String getEccontext() {
        return eccontext;
    }

    public void setEccontext(String eccontext) {
        this.eccontext = eccontext;
    }

    public Date getEccreatetime() {
        return eccreatetime;
    }

    public void setEccreatetime(Date eccreatetime) {
        this.eccreatetime = eccreatetime;
    }

    public String getEcreply() {
        return ecreply;
    }

    public void setEcreply(String ecreply) {
        this.ecreply = ecreply;
    }

    public Date getEcreplytime() {
        return ecreplytime;
    }

    public void setEcreplytime(Date ecreplytime) {
        this.ecreplytime = ecreplytime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment(int ecid, String eccontext, Date eccreatetime, String ecreply, Date ecreplytime, User user) {
        this.ecid = ecid;
        this.eccontext = eccontext;
        this.eccreatetime = eccreatetime;
        this.ecreply = ecreply;
        this.ecreplytime = ecreplytime;
        this.user = user;
    }

    public Comment(int ecid) {
        this.ecid = ecid;
    }

    public Comment() {
    }
}
