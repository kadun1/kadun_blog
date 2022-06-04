package com.kadun.kadun_blog.controller.api;

import com.kadun.kadun_blog.dto.PostSaveDto;
import com.kadun.kadun_blog.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final BoardService boardService;

    @PostMapping
    public Long save(@RequestBody PostSaveDto postSaveDto) {
        return boardService.write(postSaveDto);
    }
}
