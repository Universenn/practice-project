package repository;

import domain.Post;

import java.util.ArrayList;
import java.util.List;

public class ConsolePostRepository {
    private List<Post> database = new ArrayList<>();

    public List<Post> findAll() {
        return database;
    }
    public Post save(Post post) {
        post.setId(getLastId() + 1);
        database.add(post);
        return post;
    }

    public Post findOneById(int id) {
        Post findPost = null;
        /*
        * 기존 리스트의 인덱스로 게시글을 찾는 방식은
        * 1, 2, 3번 게시글이 있다고 가정했을 때
        * 2번 게시글을 삭제하고 2번을 조회하면 3번 글이 조회됨.
        */
        for (Post post : database) {
            if (post.getId() == id) {
                findPost = post;
                break;
            }
        }

        return findPost;
    }

    public int deleteById(int id) {
        try {
            database.remove(id-1);
            return id;
        } catch (IndexOutOfBoundsException ignore) {
        }
        return -1;
    }

    private int getLastId() {
        if (database.size() == 0) return 0;
        return database.get(database.size() - 1).getId();
    }
}
