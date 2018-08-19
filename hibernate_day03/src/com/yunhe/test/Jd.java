package com.yunhe.test;

public class Jd {

    private int jdId;
    private String jdName;
    private Qy qy=new Qy();

    public Jd() {
    }

    public Jd(String jdName) {
        this.jdName = jdName;
    }

    public Jd(String jdName, Qy qy) {
        this.jdName = jdName;
        this.qy = qy;
    }

    public int getJdId() {
        return jdId;
    }

    public void setJdId(int jdId) {
        this.jdId = jdId;
    }

    public String getJdName() {
        return jdName;
    }

    public void setJdName(String jdName) {
        this.jdName = jdName;
    }

    public Qy getQy() {
        return qy;
    }

    public void setQy(Qy qy) {
        this.qy = qy;
    }
}
