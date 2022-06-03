package com.kadun.kadun_blog.repository;

import com.kadun.kadun_blog.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
