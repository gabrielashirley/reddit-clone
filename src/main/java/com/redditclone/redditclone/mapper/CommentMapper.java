package com.redditclone.redditclone.mapper;

import com.redditclone.redditclone.dto.CommentsDto;
import com.redditclone.redditclone.model.Comment;
import com.redditclone.redditclone.model.Post;
import com.redditclone.redditclone.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "id", ignore = true) // ignoring this because id will be auto-generated whenever saved to DB
    @Mapping(target = "text", source = "commentsDto.text")
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())") // write like this because import statement will not be included
    @Mapping(target = "post", source = "post")
    @Mapping(target = "user", source = "user")
    Comment map(CommentsDto commentsDto, Post post, User user);

    @Mapping(target = "postId", expression = "java(comment.getPost().getPostId())")
    @Mapping(target = "userName", expression = "java(comment.getUser().getUsername())")
    CommentsDto mapToDto(Comment comment);
}