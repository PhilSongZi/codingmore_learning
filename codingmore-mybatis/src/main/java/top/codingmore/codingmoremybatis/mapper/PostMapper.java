package top.codingmore.codingmoremybatis.mapper;

import top.codingmore.codingmoremybatis.entity.Posts;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/18 11:06
 * @description here is a description of this file.
 */
public interface PostMapper {
    List<Posts> getAll();
    Posts getOne(Long id);
    void insert(Posts post);
    void update(Posts post);
    void delete(Long id);
}
