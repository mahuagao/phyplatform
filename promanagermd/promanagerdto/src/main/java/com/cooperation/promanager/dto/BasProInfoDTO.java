package com.cooperation.promanager.dto;

public class BasProInfoDTO {

    private Long procateid;

    private Long probandid;

    private Long profacid;

    private String proname;

    private String apronum;

    public Long getProcateid() {
        return procateid;
    }

    public void setProcateid(Long procateid) {
        this.procateid = procateid;
    }

    public Long getProbandid() {
        return probandid;
    }

    public void setProbandid(Long probandid) {
        this.probandid = probandid;
    }

    public Long getProfacid() {
        return profacid;
    }

    public void setProfacid(Long profacid) {
        this.profacid = profacid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getApronum() {
        return apronum;
    }

    public void setApronum(String apronum) {
        this.apronum = apronum;
    }
}
