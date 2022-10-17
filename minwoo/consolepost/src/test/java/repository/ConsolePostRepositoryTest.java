package repository;

import domain.Post;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ConsolePostRepositoryTest {
    private ConsolePostRepository consolePostRepository = new ConsolePostRepository();

    @Test
    @DisplayName("저장 테스트")
    void save() {
        Post post = new Post("안녕하세요", "홍길동", "반갑습니다.");

        Post saved = consolePostRepository.save(post);

        assertEquals(1, saved.getId());
    }

    @Nested
    class FindTest {
        @Test
        @DisplayName("아이디로 검색 테스트")
        void findOneById() {
            Post post = new Post("안녕하세요", "홍길동", "반갑습니다.");

            Post saved = consolePostRepository.save(post);

            Post find = consolePostRepository.findOneById(1);

            assertEquals(saved.getId(), find.getId());
        }

        @Test
        @DisplayName("글 삭제 후 아이디로 검색 테스트")
        void findOneByIdAfterDel() {
            //given
            Post post1 = new Post("안녕하세요", "홍길동", "반갑습니다.");
            Post post2 = new Post("안녕하세요", "홍길동", "반갑습니다.");
            Post post3 = new Post("안녕하세요", "홍길동", "반갑습니다.");

            Post saved1 = consolePostRepository.save(post1);
            Post saved2 = consolePostRepository.save(post2);
            Post saved3 = consolePostRepository.save(post3);

            Post find1 = consolePostRepository.findOneById(saved1.getId());
            Post find2 = consolePostRepository.findOneById(saved2.getId());
            Post find3 = consolePostRepository.findOneById(saved3.getId());

            assertEquals(saved1.getId(), find1.getId());
            assertEquals(saved2.getId(), find2.getId());
            assertEquals(saved3.getId(), find3.getId());

            //when
            consolePostRepository.deleteById(saved2.getId());

            find1 = consolePostRepository.findOneById(saved1.getId());
            find3 = consolePostRepository.findOneById(saved3.getId());

            assertEquals(saved1.getId(), find1.getId());
            assertEquals(saved3.getId(), find3.getId());
        }

        @Test
        @DisplayName("잘못된 아이디로 검색 시 null 반환")
        void findOneByWrongId() {
            Post find = consolePostRepository.findOneById(1);
            assertNull(find);
        }
    }

    @Test
    @DisplayName("아이디로 삭제 테스트")
    void deleteById() {
        Post post = new Post("안녕하세요", "홍길동", "반갑습니다.");

        Post saved = consolePostRepository.save(post);

        assertEquals(saved.getId(), consolePostRepository.deleteById(saved.getId()));
    }
}