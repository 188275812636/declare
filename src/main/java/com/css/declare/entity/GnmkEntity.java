package com.css.declare.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: rgy
 * Date: 2019/9/12 14:41
 */

@Entity
@Table(name = "gn_mk", schema = "", catalog = "")
public class GnmkEntity implements Serializable {

    private String id;
    private String mk_mc;
    private String yxbz;
    private String mk_url;
    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mk_mc", nullable = false, length = 255)
    public String getMk_mc() {
        return mk_mc;
    }

    public void setMk_mc(String mk_mc) {
        this.mk_mc = mk_mc;
    }

    @Basic
    @Column(name = "yzbz", nullable = false, length = 1)
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    @Basic
    @Column(name = "mk_url", nullable = false, length = 1)
    public String getMk_url() {
        return mk_url;
    }

    public void setMk_url(String mk_url) {
        this.mk_url = mk_url;
    }
}