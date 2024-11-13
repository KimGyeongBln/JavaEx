package test;

public class Customer extends User {
    private int point;

    // 생성자
    public Customer(String id, String password, String name, int point) {
        super(id, password, name);
        this.point = point;
    }

    // getter, setter
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", 포인트:" + point;
    }

    // showInfo() 메서드 구현
    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
