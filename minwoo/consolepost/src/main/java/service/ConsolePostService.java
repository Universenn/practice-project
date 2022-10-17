package service;

import domain.Post;
import dto.PostReqDTO;
import repository.ConsolePostRepository;

import java.util.List;

public class ConsolePostService {
    private ConsolePostRepository consolePostRepository;

    public ConsolePostService(ConsolePostRepository consolePostRepository) {
        this.consolePostRepository = consolePostRepository;
    }

    public List<Post> findAllPost() {
        return consolePostRepository.findAll();
    }

    public Post createPost(PostReqDTO dto) {
        return consolePostRepository.save(dto.toEntity());
    }

    public Post findOne(int id) {
        Post post = consolePostRepository.findOneById(id);
        if (post == null) System.out.println("해당하는 게시글이 없습니다.");
        return post;
    }

    public void deleteOne(int id) {
        consolePostRepository.deleteById(id);
    }
}
