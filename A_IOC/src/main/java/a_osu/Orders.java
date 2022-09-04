package a_osu;

/**
 * @author kinoz
 * @Date 2022/7/17 - 9:09
 * @apiNote 名称空间p标签的使用
 */
public class Orders {
    private String orderNo;
    private String orderPic;

    private String orderName;
    private String orderAddress;


    public Orders(String orderNo, String orderPic, String orderName, String orderAddress) {
        this.orderNo = orderNo;
        this.orderPic = orderPic;
        this.orderName = orderName;
        this.orderAddress = orderAddress;
    }

    public Orders() {
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderPic(String orderPic) {
        this.orderPic = orderPic;
    }

    public void OrderInfo(){
        System.out.println(orderNo);
        System.out.println(orderPic);
        System.out.println(orderName);
        System.out.println(orderAddress);
    }
}
