package com.lay.spring_boot_3_backend.repository;

import com.lay.spring_boot_3_backend.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
