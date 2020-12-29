package com.itly.pojo;

public class UserVo {
    private int userId;
    private String userPw;
    private String userName;
    private String userFullName;
    private String userInfo;
    private String faceImage;

    public UserVo() {
    }

    public UserVo(int userId, String userPw, String userName, String userFullName, String userInfo, String faceImage, int userDisplay) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userFullName = userFullName;
        this.userInfo = userInfo;
        this.faceImage = faceImage;
        this.userDisplay = userDisplay;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    private int userDisplay;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public int getUserDisplay() {
        return userDisplay;
    }

    public void setUserDisplay(int userDisplay) {
        this.userDisplay = userDisplay;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userId=" + userId +
                ", userPw='" + userPw + '\'' +
                ", userName='" + userName + '\'' +
                ", userFullName='" + userFullName + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", faceImage='" + faceImage + '\'' +
                ", userDisplay=" + userDisplay +
                '}';
    }
}
