package lionlike.team13.juwan.console.src.main.java.domain;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    private int numsc;
    public int getNumsc() {
        return numsc = sc.nextInt();
    }
    private String writersc;
    private String titlesc;
    private String textsc;

    ArrayList<String> writer = new ArrayList<>();

    ArrayList<String> title = new ArrayList<>();

    ArrayList<String> text = new ArrayList<>();

    public String getWritersc() {
        return writersc = sc.next();
    }

    public String getTitlesc() {
        return titlesc = sc.next();
    }

    public String getTextsc() {
        return textsc = sc.next();
    }

    public ArrayList<String> getWriter() {
        return writer;
    }

    public ArrayList<String> getTitle() {
        return title;
    }

    public ArrayList<String> getText() {
        return text;
    }
}
