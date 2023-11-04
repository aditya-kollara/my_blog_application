package com.vlog.service;

import com.vlog.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> listAlPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    void deletePostById(long id);
}
