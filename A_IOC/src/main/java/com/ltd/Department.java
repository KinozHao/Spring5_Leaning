package com.ltd;

/**
 * @author kinoz
 * @Date 2022/7/17 - 10:17
 * @apiNote 部门类
 */
public class Department {
    String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
