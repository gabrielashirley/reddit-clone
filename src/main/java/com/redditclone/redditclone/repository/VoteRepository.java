package com.redditclone.redditclone.repository;

import com.redditclone.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
