package com.xiaomin.blog.model;

/**
 * @Author: xiaomin
 * @Description:
 * @Date Created in 21:56 2019/11/6
 * @Modified By:
 */
public class Dog{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}