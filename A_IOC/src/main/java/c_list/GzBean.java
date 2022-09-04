package c_list;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author kinoz
 * @Date 2022/7/18 - 14:26
 * @apiNote FactoryBean接口的理解
 */
public class GzBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourse_Name("Python数据爬取");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
