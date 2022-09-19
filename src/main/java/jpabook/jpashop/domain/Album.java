package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Album extends Item{

    public String getAtrist() {
        return atrist;
    }

    public void setAtrist(String atrist) {
        this.atrist = atrist;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    private String atrist;
    private String etc;
}