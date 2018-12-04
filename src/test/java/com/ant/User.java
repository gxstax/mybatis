package com.ant;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: User
 * @Description: TODO
 * @datetime 2018/10/23 14:31
 * @Version 1.0
 */
public class User {
    private String id;
    private String userName;
    private int age;
    private String desc;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "userName:[" + this.userName + "] " +
                "age:[" + this.age + "] " +
                "desc:[" + this.desc + "] ";
    }
}
