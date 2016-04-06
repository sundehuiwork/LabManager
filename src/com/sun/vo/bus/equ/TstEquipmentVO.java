package com.sun.vo.bus.equ;

import java.math.BigDecimal;
import java.util.Date;

public class TstEquipmentVO {
    private String id;

    private String equnum;

    private String equname;

    private String equmodel;

    private String equspec;

    private String equcountry;

    private BigDecimal equamount;

    private String outnum;

    private Date outdate;

    private Date equindate;

    private String equinperson;

    private String equinorg;

    private Date equoutdate;

    private String equoutperson;

    private String status;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEqunum() {
        return equnum;
    }

    public void setEqunum(String equnum) {
        this.equnum = equnum == null ? null : equnum.trim();
    }

    public String getEquname() {
        return equname;
    }

    public void setEquname(String equname) {
        this.equname = equname == null ? null : equname.trim();
    }

    public String getEqumodel() {
        return equmodel;
    }

    public void setEqumodel(String equmodel) {
        this.equmodel = equmodel == null ? null : equmodel.trim();
    }

    public String getEquspec() {
        return equspec;
    }

    public void setEquspec(String equspec) {
        this.equspec = equspec == null ? null : equspec.trim();
    }

    public String getEqucountry() {
        return equcountry;
    }

    public void setEqucountry(String equcountry) {
        this.equcountry = equcountry == null ? null : equcountry.trim();
    }

    public BigDecimal getEquamount() {
        return equamount;
    }

    public void setEquamount(BigDecimal equamount) {
        this.equamount = equamount;
    }

    public String getOutnum() {
        return outnum;
    }

    public void setOutnum(String outnum) {
        this.outnum = outnum == null ? null : outnum.trim();
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public Date getEquindate() {
        return equindate;
    }

    public void setEquindate(Date equindate) {
        this.equindate = equindate;
    }

    public String getEquinperson() {
        return equinperson;
    }

    public void setEquinperson(String equinperson) {
        this.equinperson = equinperson == null ? null : equinperson.trim();
    }

    public String getEquinorg() {
        return equinorg;
    }

    public void setEquinorg(String equinorg) {
        this.equinorg = equinorg == null ? null : equinorg.trim();
    }

    public Date getEquoutdate() {
        return equoutdate;
    }

    public void setEquoutdate(Date equoutdate) {
        this.equoutdate = equoutdate;
    }

    public String getEquoutperson() {
        return equoutperson;
    }

    public void setEquoutperson(String equoutperson) {
        this.equoutperson = equoutperson == null ? null : equoutperson.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}