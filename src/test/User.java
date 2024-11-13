package test;
public abstract class User {
    private String id;
    private String password;
    private String name;

    // 생성자
    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    // getter, setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString()
    @Override
    public String toString() {
        return
                "아이디:" + id + '\'' +
                "비번:" + password + '\'' +
                "이름:" + name + '\'';
                
    }

    // showInfo()는 자식 클래스에서 구현하도록 추상 메서드로 정의
    public abstract void showInfo();
}
