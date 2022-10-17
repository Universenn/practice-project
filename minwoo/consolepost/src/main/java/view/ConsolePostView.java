package view;

import domain.Post;

import java.util.List;

public class ConsolePostView {
    public void menu() {
        System.out.println("===============================================================");
        System.out.println("메뉴");
        System.out.println("===============================================================");
        System.out.println("1.전체 글 조회\t2.글 번호로 조회\t3.글 등록\t4.글 삭제\t5.종료");
        System.out.println("===============================================================");
        System.out.print("> ");
    }

    public void postListUp(List<Post> posts) {
        System.out.println("===============================================================");
        System.out.printf("%-5s%-45s%-10s\n", "번호", "제목", "작성자");
        System.out.println("===============================================================");
        for (Post post : posts) {
            System.out.printf("%-5d%-45s%-10s\n", post.getId(), post.getTitle(), post.getAuthor());
        }
    }

    public void inputTextAuthor() {
        System.out.println("===============================================================");
        System.out.print("작성자 > ");
    }

    public void inputTextTitle() {
        System.out.print("제목 > ");
    }

    public void inputTextBody() {
        System.out.print("본문 > ");
    }

    public void inputId() {
        System.out.println("===============================================================");
        System.out.print("번호 > ");
    }

    public void completeSave(Post post) {
        System.out.println("===============================================================");
        System.out.println("등록 완료");
        printPost(post);
    }

    public void printPost(Post post) {
        if (post == null) return;
        System.out.println("===============================================================");
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("작성자 : %s\n", post.getAuthor());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("본문 : %s\n", post.getBody());
    }
}
