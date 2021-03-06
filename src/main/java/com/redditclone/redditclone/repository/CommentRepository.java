package com.redditclone.redditclone.repository;

import com.redditclone.redditclone.model.Comment;
import com.redditclone.redditclone.model.Post;
import com.redditclone.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
