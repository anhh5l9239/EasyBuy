package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 */
public class User implements Serializable {
    private int userid;//用id
    private String username;//登陆名
    private  String userusername;//用户名
    private  String userpwd;//用户密码
    private  String usersex;//性别
    private Date userbrithday;//生日
    private String useremail;//邮箱
    private String useraddress;//家庭地址
    private int userflag;//状态

    public User() {
    }

    public User(int userid, String username, String userusername, String userpwd, String usersex, Date userbrithday, String useremail, String useraddress, int userflag) {
        this.userid = userid;
        this.username = username;
        this.userusername = userusername;
        this.userpwd = userpwd;
        this.usersex = usersex;
        this.userbrithday = userbrithday;
        this.useremail = useremail;
        this.useraddress = useraddress;
        this.userflag = userflag;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserusername() {
        return userusername;
    }

    public void setUserusername(String userusername) {
        this.userusername = userusername;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public Date getUserbrithday() {
        return userbrithday;
    }

    public void setUserbrithday(Date userbrithday) {
        this.userbrithday = userbrithday;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public int getUserflag() {
        return userflag;
    }

    public void setUserflag(int userflag) {
        this.userflag = userflag;
    }
}
