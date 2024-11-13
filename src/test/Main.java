package test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // User 객체들을 담을 ArrayList 생성
        ArrayList<User> userList = new ArrayList<>();

        // User 객체 추가
        userList.add(new Staff("master", "m7788", "운영자", 3500000));
        userList.add(new Customer("jung-ws", "j1357913579", "정우성", 1000));
        userList.add(new Customer("LeeHR", "a123!!", "이효리", 2500));
        userList.add(new Customer("ms-park", "y2345", "박명수", 1200));

        // 일련번호를 포함한 출력
        int count = 1;
        for (User user : userList) {
            System.out.print(count + ". ");
            user.showInfo();

            // Staff일 경우 money * 12 출력
            if (user instanceof Staff) {
                Staff staff = (Staff) user;
                System.out.println("운영자의 연봉은 " + staff.getMoney() * 12 + " 입니다.");
            }

            count++;
            System.out.println();
        }
    }
}
