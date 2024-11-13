package test;

public class Staff extends User {
    private int money;

    // 생성자
    public Staff(String id, String password, String name, int money) {
        super(id, password, name);
        this.money = money;
    }

    // getter, setter
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", 월급:" + money;
    }

    // showInfo() 메서드 구현
    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
