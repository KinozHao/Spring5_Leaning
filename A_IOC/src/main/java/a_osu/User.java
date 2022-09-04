package a_osu;

/**
 * @author kinoz
 * @Date 2022/7/15 - 10:54
 * @apiNote
 */
public class User {
    private String username;
    private String userpass;

    public User(String username, String userpass) {
        this.username = username;
        this.userpass = userpass;
    }

    public void UsOutput(){
        System.out.println("我是用户");
    }

    public void param(){
        System.out.println(username+"::"+userpass);
    }
}
