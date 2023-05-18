package top.codingmore.codingmoremybatis.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/18 11:18
 * @description here is a description of this file.
 */
@Data
@Builder
public class Posts {
    private Long postsId;
    private Long postAuthor;
    private String postContent;
    private String postTitle;

    @Tolerate
    Posts() {}
}
