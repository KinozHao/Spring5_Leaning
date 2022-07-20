package com.ltd;

/**
 * @author kinoz
 * @Date 2022/7/17 - 10:17
 * @apiNote 员工类
 */
public class Staff {
    String name;
    String gender;
    //员工属于某一个部门 使用对象形式表示
    Department dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDept() {
        return dept;
    }
    //get方法 级联操作方式二需要
    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void showInfo(){
        System.out.println(name+"::"+gender+"::"+ dept);
    }

}
