package com.itly.pojo;


public class BgmVo{
    private int bgmId;
    private String bgmName;
    private String bgmAuthor;
    private String bgmAlbum;
    private String bgmPath;
    private int userId;

    public int getBgmId() {
        return bgmId;
    }

    public void setBgmId(int bgmId) {
        this.bgmId = bgmId;
    }

    public String getBgmName() {
        return bgmName;
    }

    public void setBgmName(String bgmName) {
        this.bgmName = bgmName;
    }

    public String getBgmAuthor() {
        return bgmAuthor;
    }

    public void setBgmAuthor(String bgmAuthor) {
        this.bgmAuthor = bgmAuthor;
    }

    public String getBgmAlbum() {
        return bgmAlbum;
    }

    public void setBgmAlbum(String bgmAlbum) {
        this.bgmAlbum = bgmAlbum;
    }

    public String getBgmPath() {
        return bgmPath;
    }

    public void setBgmPath(String bgmPath) {
        this.bgmPath = bgmPath;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BgmVo{" +
                "bgmId=" + bgmId +
                ", bgmName='" + bgmName + '\'' +
                ", bgmAuthor='" + bgmAuthor + '\'' +
                ", bgmAlbum='" + bgmAlbum + '\'' +
                ", bgmPath='" + bgmPath + '\'' +
                ", userId=" + userId +
                '}';
    }
}
