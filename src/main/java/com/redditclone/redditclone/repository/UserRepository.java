package com.redditclone.redditclone.repository;

import com.redditclone.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
