package com.example.Fortest.login;

/**
 * 用于注册、登录
 */
public class User {
    private String name;            //用户名
    private String password;        //密码
    private String sex;
    private String birth;
    private String city;
    private String describe;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDiscribe() {
        return describe;
    }

    public void setDiscribe(String discribe) {
        this.describe = discribe;
    }

    public User(String name, String password, String sex,String birth,String city,String describe) {
        this.name = name;
        this.password = password;
        this.sex=sex;
        this.birth=birth;
        this.city=city;
        this.describe=describe;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

