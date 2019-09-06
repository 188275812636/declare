package com.css.declare.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * \* User: rgy
 * \* Date: 2019/8/27 16:43
 * \
 */
@Entity
@Table(name = "s_user", schema = "", catalog = "")
public class S_User {

    private String id;
    private String sjhm;
    private String zjhm;
    private String zjlx_dm;
    private String xm;
    private String pwd;
    private String yhlx;
    private String yxbz;
    private Date lrsj;
    private String xgsj;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sjhm", nullable = false, length = 20)
    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    @Basic
    @Column(name = "zjhm", nullable = false, length = 20)
    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    @Basic
    @Column(name = "zjlx_dm", nullable = false, length = 5)
    public String getZjlx_dm() {
        return zjlx_dm;
    }

    public void setZjlx_dm(String zjlx_dm) {
        this.zjlx_dm = zjlx_dm;
    }

    @Basic
    @Column(name = "xm", nullable = false, length = 255)
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "pwd", nullable = false, length = 255)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "yhlx", nullable = false, length = 1)
    public String getYhlx() {
        return yhlx;
    }

    public void setYhlx(String yhlx) {
        this.yhlx = yhlx;
    }

    @Basic
    @Column(name = "yxbz", nullable = false, length = 1)
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    @Basic
    @Column(name = "lrsj", nullable = false, length = 0)
    public Date getLrsj() {
        return lrsj;
    }

    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
    }

    @Basic
    @Column(name = "xgsj", nullable = false, length = 0)
    public String getXgsj() {
        return xgsj;
    }

    public void setXgsj(String xgsj) {
        this.xgsj = xgsj;
    }
}