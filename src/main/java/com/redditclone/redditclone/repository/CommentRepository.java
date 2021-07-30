package com.redditclone.redditclone.repository;

import com.redditclone.redditclone.model.Comment;
import com.redditclone.redditclone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Collection<Object> findByPost(Post post);
}
