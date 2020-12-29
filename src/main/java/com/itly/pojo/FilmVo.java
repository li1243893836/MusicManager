package com.itly.pojo;

public class FilmVo {
    private int filmId;
    private String filmName;
    private String filmInfo;
    private String filmPath;
    private String likeCounts;
    private String filmStatus;
    private String createTime;
    private String userId;

    public FilmVo() {
    }

    public FilmVo(int filmId, String filmName, String filmInfo, String filmPath, String likeCounts, String filmStatus, String createTime, String userId) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmInfo = filmInfo;
        this.filmPath = filmPath;
        this.likeCounts = likeCounts;
        this.filmStatus = filmStatus;
        this.createTime = createTime;
        this.userId = userId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(String filmInfo) {
        this.filmInfo = filmInfo;
    }

    public String getFilmPath() {
        return filmPath;
    }

    public void setFilmPath(String filmPath) {
        this.filmPath = filmPath;
    }

    public String getLikeCounts() {
        return likeCounts;
    }

    public void setLikeCounts(String likeCounts) {
        this.likeCounts = likeCounts;
    }

    public String getFilmStatus() {
        return filmStatus;
    }

    public void setFilmStatus(String filmStatus) {
        this.filmStatus = filmStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "FilmVo{" +
                "filmId=" + filmId +
                ", filmName='" + filmName + '\'' +
                ", filmInfo='" + filmInfo + '\'' +
                ", filmPath='" + filmPath + '\'' +
                ", likeCounts='" + likeCounts + '\'' +
                ", filmStatus='" + filmStatus + '\'' +
                ", createTime=" + createTime +
                ", userId='" + userId + '\'' +
                '}';
    }
}
