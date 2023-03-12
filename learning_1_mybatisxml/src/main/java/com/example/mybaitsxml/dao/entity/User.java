package com.example.mybaitsxml.dao.entity;




public class User {
    private String name ;
    private String sex;
    private Integer age;

    private Integer id;
    private Integer classNo;

    public User(String name, String sex, Integer age, Integer classNo) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.classNo = classNo;
    }

    public User() {
    }

    public User(String name, String sex, Integer age, Integer id, Integer classNo) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.id = id;
        this.classNo = classNo;
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return classNo
     */
    public Integer getClassNo() {
        return classNo;
    }

    /**
     * 设置
     * @param classNo
     */
    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String toString() {
        return "User{name = " + name + ", sex = " + sex + ", age = " + age + ", id = " + id + ", classNo = " + classNo + "}";
    }
}
