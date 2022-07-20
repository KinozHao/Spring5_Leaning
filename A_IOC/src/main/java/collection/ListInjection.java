package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/7/17 - 18:21
 * @apiNote 注入集合与数组类型属性
 */
public class ListInjection {
    private String[] data;

    private List<String> list;

    private Map<String,String> map;

    //引用数据类型集合
    private List<Course> courseList;

    public void setData(String[] data) {
        this.data = data;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    //输出从bean文件设置的属性值
    public void listData(){
        System.out.println(Arrays.toString(data));
        System.out.println(list);
        System.out.println(map);
        System.out.println(courseList);
    }


}
