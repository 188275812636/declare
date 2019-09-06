package com.css.declare.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * \* User: rgy
 * \* Date: 2019/8/22 11:20
 * \
 */
@Entity
@Table(name = "t_sbb", schema = "", catalog = "")
public class T_Sbb implements Serializable {
    private static final long serialVersionUID = -2242664293223677212L;

    private String id;
    private String userid;
    private String sbzt;
    private Date lrsj;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userid", nullable = false, length = 32)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "sbzt", nullable = false, length = 1)
    public String getSbzt() {
        return sbzt;
    }

    public void setSbzt(String sbzt) {
        this.sbzt = sbzt;
    }

    @Basic
    @Column(name = "lrsj", nullable = false, length = 0)
    public Date getLrsj() {
        return lrsj;
    }

    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
    }
}