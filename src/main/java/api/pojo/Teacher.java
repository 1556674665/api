package api.pojo;

public class Teacher {//老师表
    private int id;//主键
    private String creation_time;//创建时间
    private String modification_time;//修改时间
    private String name;//姓名
    private String brief_introduction;//简介
    private int age;//年龄
    private int gender;//性别
    private int qq_number;//QQ号
    private String wechat_number;//微信号
    private String introduce;//介绍

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(String creation_time) {
        this.creation_time = creation_time;
    }

    public String getModification_time() {
        return modification_time;
    }

    public void setModification_time(String modification_time) {
        this.modification_time = modification_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief_introduction() {
        return brief_introduction;
    }

    public void setBrief_introduction(String brief_introduction) {
        this.brief_introduction = brief_introduction;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getQq_number() {
        return qq_number;
    }

    public void setQq_number(int qq_number) {
        this.qq_number = qq_number;
    }

    public String getWechat_number() {
        return wechat_number;
    }

    public void setWechat_number(String wechat_number) {
        this.wechat_number = wechat_number;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
