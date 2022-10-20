package lionlike.team13.juwan.console.src.main.practicemethod;

public class MethodPractice {
    public void nameAndAge(String name, int age){
        System.out.printf("안녕하세요 %s 나이는 %d 입니다.",name,age);
    }
    public static void main(String[] args) {
        MethodPractice methodPractice = new MethodPractice();
        methodPractice.nameAndAge("우주완", 25);
    }
}
