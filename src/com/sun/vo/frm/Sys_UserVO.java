package com.sun.vo.frm;

import java.util.Date;

public class Sys_UserVO {
    private String id;

    private String userCode;

    private String userName;

    private String password;

    private String tel;

    private String mail;

    private String remark;

    private String type;

    private String deleteflag;

    private String recordstatus;

    private String inputuser;

    private Date inputdatetime;

    private String modifyuser;

    private Date modifytime;

    public Sys_UserVO(String id, String userCode, String userName, String password, String tel, String mail, String remark, String type, String deleteflag, String recordstatus, String inputuser, Date inputdatetime, String modifyuser, Date modifytime) {
        this.id = id;
        this.userCode = userCode;
        this.userName = userName;
        this.password = password;
        this.tel = tel;
        this.mail = mail;
        this.remark = remark;
        this.type = type;
        this.deleteflag = deleteflag;
        this.recordstatus = recordstatus;
        this.inputuser = inputuser;
        this.inputdatetime = inputdatetime;
        this.modifyuser = modifyuser;
        this.modifytime = modifytime;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag == null ? null : deleteflag.trim();
    }

    public String getRecordstatus() {
        return recordstatus;
    }

    public void setRecordstatus(String recordstatus) {
        this.recordstatus = recordstatus == null ? null : recordstatus.trim();
    }

    public String getInputuser() {
        return inputuser;
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser == null ? null : inputuser.trim();
    }

    public Date getInputdatetime() {
        return inputdatetime;
    }

    public void setInputdatetime(Date inputdatetime) {
        this.inputdatetime = inputdatetime;
    }

    public String getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser == null ? null : modifyuser.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}