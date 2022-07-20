/**
 * @author kinoz
 * @Date 2022/7/15 - 14:27
 * @apiNote
 */
public class ServerFw {
    private String serverName;

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerName() {
        return serverName;
    }

    public void seOutput(){
        System.out.println("我是服务器");
    }
}
