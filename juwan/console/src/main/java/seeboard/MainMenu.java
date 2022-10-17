package lionlike.team13.juwan.console.src.main.java.seeboard;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    // 추가 하고싶은 것
    // 글 번호로 조회, 글 삭제
    // 없는 번호 일때 ( "등록되지 않는 정보입니다.") 출력하기  - if 문을 처리

    Scanner sc = new Scanner(System.in);
    int num;
    String writersc;
    String titlesc;
    String textsc;

    ArrayList<String> writer = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> text = new ArrayList<>();
    public void printmenu(){
        while (true){
            menu();
            num = sc.nextInt();
            switch (num){
                case 1 : menu1(); break;
                case 2 : menu2(); break;
                case 3 : menu3(); break;
                case 4 : menu4(); break;
                case 5 :
                    System.out.println("게시판을 종료합니다.");return;
                default:
                    System.out.println("잘못된 값을 입력하셨습니다. (ex 1~4)"); //default 값에 문자를 넣어도 실행하게 할수 없을까
                    break;
            }
        }
    }

    public void menu(){
        System.out.println("==============================================================");
        System.out.println("메뉴");
        System.out.println("==============================================================");
        System.out.println("1. 전체 글 조회 2. 글 번호로 조회 3. 글 등록 4. 글 삭제 5. 종료");
        System.out.println("==============================================================");
        System.out.print("> ");
    }

    public void menu1(){  // 콘솔 출력 정렬을 맞추는 방법이 있지않을까
        System.out.println("==============================================================");
        System.out.println("번호                        제목                      작성자");
        System.out.println("==============================================================");
        for (int i=0; i<writer.size(); i++) {
            System.out.printf("%d\t\t\t\t\t\t\t%s\t\t\t\t\t\t%s\n",i+1,title.get(i),writer.get(i));
        }
    }

    public void menu2(){
        System.out.println("==============================================================");
        System.out.print("번호 입력 > ");
        num = sc.nextInt();
        if(writer.size()>=num){
        System.out.println("==============================================================");
        System.out.printf("번호 : %d\n",num);
        System.out.printf("작성자 : %s\n",writer.get(num-1));
        System.out.printf("제목 : %s\n",title.get(num-1));
        System.out.printf("본문 : %s\n",text.get(num-1));
        }
        else System.out.println( "등록되지 않는 정보입니다.");
    }
    public void menu3(){
        System.out.println("==============================================================");
        System.out.printf("작성자 : > ");
        writersc = sc.next();
        writer.add(writersc);
        System.out.printf("제목 : > ");
        titlesc = sc.next();
        title.add(titlesc);
        System.out.printf("본문 : > ");
        textsc = sc.next();
        text.add(textsc);  // text를 title로 써놨다.. 조심
        System.out.println("==============================================================");
        System.out.println("등록완료");
        System.out.printf("번호 : %s\n",writer.size());
        System.out.printf("작성자 : %s\n",writersc);
        System.out.printf("제목 : %s\n",titlesc);
        System.out.printf("본문 : %s\n",textsc);
    }

    public void menu4(){
        System.out.println("==============================================================");
        System.out.print("번호 입력 > ");
        int num2 = sc.nextInt();
        if(writer.size()>=num) {
            System.out.println("==============================================================");
            writer.remove(num2 - 1);
            title.remove(num2 - 1);
            text.remove(num2 - 1);
            System.out.println("삭재완료");
            System.out.println("==============================================================");
        }
        else System.out.println( "등록되지 않는 정보입니다.");

    }


}
