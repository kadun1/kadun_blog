package com.kadun.kadun_blog.domain;

import com.kadun.kadun_blog.dto.PostSaveDto;
import com.kadun.kadun_blog.model.Board;
import com.kadun.kadun_blog.model.Role;
import com.kadun.kadun_blog.model.User;
import com.kadun.kadun_blog.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    BoardRepository boardRepository;


    @Test
    public void 글쓰기테스트() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";
        User user = User.builder()
                .name("테스트유저")
                .email("test@naver.com")
                .password("1234")
                .role(Role.USER)
                .build();
        PostSaveDto postSaveDto = PostSaveDto.builder()
                .user(user)
                .title(title)
                .content(content)
                .build();
        Board tempBoard = postSaveDto.toEntity();
        boardRepository.save(tempBoard);
        //when
        List<Board> boardList = boardRepository.findAll();

        //then
        Board board = boardList.get(0);
        assertThat(board.getTitle()).isEqualTo(title);
        assertThat(board.getContent()).isEqualTo(content);
        assertThat(board.getUser()).isEqualTo(user);
    }
}
