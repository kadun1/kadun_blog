package com.kadun.kadun_blog.service;

import com.kadun.kadun_blog.dto.PostSaveDto;
import com.kadun.kadun_blog.model.Board;
import com.kadun.kadun_blog.model.User;
import com.kadun.kadun_blog.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Autowired
    private final BoardRepository boardRepository;

    public Long write(PostSaveDto postSaveDto) {
        return boardRepository.save(postSaveDto.toEntity()).getId();
    }

}
