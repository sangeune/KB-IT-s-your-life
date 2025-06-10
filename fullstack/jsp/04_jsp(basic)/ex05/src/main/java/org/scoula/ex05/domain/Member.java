package org.scoula.ex05.domain;

public class Member {
    private String name;
    private String userid;

    //기본 생성자
    public Member() {}

    //매개변수가 있는 생성자
    public Member(String name, String userid) {
        this.name = name;
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}


