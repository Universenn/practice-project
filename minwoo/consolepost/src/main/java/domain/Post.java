package domain;

public class Post {
    private int id;
    private String author;
    private String title;
    private String body;

    public Post(String author, String title, String body) {
        this.author = author;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public void setId(int id) {
        this.id = id;
    }
}
