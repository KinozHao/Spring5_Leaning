package collection;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/7/17 - 18:54
 * @apiNote javaBean类测试引用数据类型集合的注入
 */
public class Course {
    private String course_Name;
    private String course_num;
    private List<String> list;


    public Course(String course_Name, String course_num) {
        this.course_Name = course_Name;
        this.course_num = course_num;
    }
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void bookList(){
        System.out.println(list);
    }
    public Course() {
    }

    public String getCourse_Name() {
        return course_Name;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

    public String getCourse_num() {
        return course_num;
    }

    public void setCourse_num(String course_num) {
        this.course_num = course_num;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_Name='" + course_Name + '\'' +
                ", course_num='" + course_num + '\'' +
                '}';
    }
}
