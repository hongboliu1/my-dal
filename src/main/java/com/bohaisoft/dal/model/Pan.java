package com.bohaisoft.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuhb on 2017/1/17.
 */
public class Pan implements Serializable {

    private static final long serialVersionUID = -2188068117198155155L;

    private String uid;
    private String fileid;
    private Integer yn;
    private Date created;
    private Integer convert;
    private String ext;
    private String contentType;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getConvert() {
        return convert;
    }

    public void setConvert(Integer convert) {
        this.convert = convert;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }
}
