package entities;

import javax.persistence.Entity;


public class NickName extends BaseEntity {
    private String nickName;

    public NickName(String nickName) {
        this.nickName = nickName;
    }

    public NickName() {
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}

