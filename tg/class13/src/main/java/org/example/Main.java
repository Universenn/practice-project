package org.example;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
Message message=new Message();


while(true){
    message.print();
    int selNum= input.nextInt();
    message.function(selNum);
    if (selNum==5){
        break;
    }


}

//        ArrayList<String> writer = new ArrayList<>();
//        ArrayList<String> title = new ArrayList<>();
//        ArrayList<String> letter = new ArrayList<>();
//        String writerString;
//        String titleString;
//        String letterString;

//        while(true){
//            int selNum;
//        System.out.println("==============================================================");
//        System.out.println("메뉴");
//        System.out.println("==============================================================");
//        System.out.println("1. 전체 글 조회 2. 글 번호로 조회 3. 글 등록 4. 글 삭제 5. 종료");
//        System.out.println("==============================================================");
//        int n= input.nextInt();

//        if(n==3){
//            System.out.println("==============================================================");
//            System.out.print("작성자 ");
//            writerString= input.next();
//            writer.add(writerString);
//            System.out.print("제목 ");
//            titleString= input.next();
//            title.add(titleString);
//            System.out.print("본문 ");
//            letterString= input.next();
//            letter.add(letterString);
//            System.out.println("==============================================================");
//            System.out.println("등록 완료\n");
//            System.out.printf("번호 : %d\n",title.size());
//            System.out.printf("작성자 : %s\n",writerString);
//            System.out.printf("제목 : %s\n",titleString);
//            System.out.printf("본문 : %s\n",letterString);
//        }
//
//        if (n==1){
//            System.out.println("==============================================================");
//            System.out.println("번호                        제목                      작성자");
//            System.out.println("==============================================================");
//            for(int i=0;i<title.size();i++){
//                System.out.printf("%d            %s                               %s\n",i+1, title.get(i),writer.get(i));
//            }
//        }
//
//        if (n==2){
//            System.out.println("==============================================================");
//            System.out.print("번호 입력 ");
//            selNum= input.nextInt();
//            System.out.println("==============================================================");
//            System.out.printf("번호 : %d\n",selNum);
//            System.out.printf("작성자 : %s\n",writer.get(selNum-1));
//            System.out.printf("제목 : %s\n",title.get(selNum-1));
//            System.out.printf("본문 : %s\n",letter.get(selNum-1));
//        }
//
//        if(n==4){
//            System.out.println("==============================================================");
//            System.out.print("번호 입력 ");
//            selNum= input.nextInt();
//            System.out.println("==============================================================");
//
//            writer.remove(selNum-1);
//            title.remove(selNum-1);
//            letter.remove(selNum-1);
//            System.out.println("삭제 완료");
//        }
//
//        if(n==5){
//            break;
//        }

        }




    }
