package com.kadun.kadun_blog.dto;

import com.kadun.kadun_blog.model.Board;
import com.kadun.kadun_blog.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
public class PostSaveDto {

    private String title;
    private String content;
    private User user;

    @Builder
    public PostSaveDto(String title, String content, User user) {
        this.title = title;
        this.content = content;
        this.user = user;

    }

    public Board toEntity() {
        Board board = new Board();
        return board.createPost(user, title, content);
    }
}
