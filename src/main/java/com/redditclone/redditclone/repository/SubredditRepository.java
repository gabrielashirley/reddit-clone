package com.redditclone.redditclone.repository;

import com.redditclone.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

}
