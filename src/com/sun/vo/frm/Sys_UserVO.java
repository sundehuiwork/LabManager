package com.sun.vo.frm;

import java.util.Date;

public class Sys_UserVO {
    private String id;

    private String usercode;

    private String username;

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
    
    private String gender;
    
    private Date birth;

   private String cradnum;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public String getCradnum() {
		return cradnum;
	}

	public void setCradnum(String cradnum) {
		this.cradnum = cradnum;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}