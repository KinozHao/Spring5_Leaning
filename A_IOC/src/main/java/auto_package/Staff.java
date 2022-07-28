package auto_package;

/**
 * @author kinoz
 * @Date 2022/7/19 - 14:29
 * @apiNote 自动装配
 */
public class Staff {
    private Dep dep;

    public void setDep(Dep dep) {
        this.dep = dep;
    }

    public Dep getDep() {
        return dep;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "dep=" + dep +
                '}';
    }

    public void test(){
        System.out.println(dep);
    }
}
