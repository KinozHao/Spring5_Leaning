package icbc.entity;

import org.springframework.stereotype.Repository;

/**
 * @author kinoz
 * @Date 2022/7/24 - 15:43
 * @apiNote
 */
@Repository
public class Book {
    private int id;
    private String name;
    private double money;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", password='" + password + '\'' +
                '}';
    }
}
