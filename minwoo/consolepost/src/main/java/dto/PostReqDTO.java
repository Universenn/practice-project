package dto;

import domain.Post;

public class PostReqDTO {
    private final String author;
    private final String title;
    private final String body;

    public PostReqDTO(String author, String title, String body) {
        this.author = author;
        this.title = title;
        this.body = body;
    }

    public Post toEntity() {
        return new Post(author, title, body);
    }
}
