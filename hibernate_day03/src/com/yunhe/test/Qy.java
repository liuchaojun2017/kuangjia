package com.yunhe.test;


import java.util.HashSet;
import java.util.Set;

public class Qy {

    private int qyId;
    private String qyName;
    private Set<Jd> jds=new HashSet<>();

    public Qy() {
    }

    public Qy(String qyName) {
        this.qyName = qyName;
    }

    public int getQyId() {
        return qyId;
    }

    public void setQyId(int qyId) {
        this.qyId = qyId;
    }

    public String getQyName() {
        return qyName;
    }

    public void setQyName(String qyName) {
        this.qyName = qyName;
    }

    public Set<Jd> getJds() {
        return jds;
    }

    public void setJds(Set<Jd> jds) {
        this.jds = jds;
    }
}
