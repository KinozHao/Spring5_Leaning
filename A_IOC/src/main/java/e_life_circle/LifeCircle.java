package e_life_circle;

/**
 * @author kinoz
 * @Date 2022/7/18 - 18:29
 * @apiNote bean的生命周期演示
 */
public class LifeCircle {
    private String name;

    public LifeCircle() {
        System.out.println("1.通过构造器创建bean实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.为bean的属性设置值和对其他bean引入(设置set方法)");
    }

    public void init(){
        System.out.println("3.初始化方法");
    }
    public void destroy(){
        System.out.println("5.销毁方法");
    }
}
