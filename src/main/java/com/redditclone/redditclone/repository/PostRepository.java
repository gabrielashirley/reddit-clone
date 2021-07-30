package com.redditclone.redditclone.repository;

import com.redditclone.redditclone.model.Post;
import com.redditclone.redditclone.model.Subreddit;
import com.redditclone.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
