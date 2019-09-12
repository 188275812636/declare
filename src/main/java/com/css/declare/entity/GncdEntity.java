package com.css.declare.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: rgy
 * Date: 2019/9/12 14:19
 */
@Entity
@Table(name = "gn_cd", schema = "", catalog = "")
public class GncdEntity implements Serializable {

    private String id;
    private String mkid;
    private String gn_url;
    private String gn_mc;
    private String yxbz;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mkid", nullable = false, length = 255)
    public String getMkid() {
        return mkid;
    }

    public void setMkid(String mkid) {
        this.mkid = mkid;
    }

    @Basic
    @Column(name = "gn_url", nullable = false, length = 255)
    public String getGn_url() {
        return gn_url;
    }

    public void setGn_url(String gn_url) {
        this.gn_url = gn_url;
    }

    @Basic
    @Column(name = "GN_MC", nullable = false, length = 255)
    public String getGn_mc() {
        return gn_mc;
    }

    public void setGn_mc(String gn_mc) {
        this.gn_mc = gn_mc;
    }

    @Basic
    @Column(name = "yxbz", nullable = false, length = 1)
    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    private List<GncdEntity> zcdList = new ArrayList<>();

    private String zcdJson;

    @Transient
    public List<GncdEntity> getZcdList() {
        return zcdList;
    }

    public void setZcdList(List<GncdEntity> zcdList) {
        this.zcdList = zcdList;
    }

    @Transient
    public String getZcdJson() {
        return zcdJson;
    }

    public void setZcdJson(String zcdJson) {
        this.zcdJson = zcdJson;
    }
}