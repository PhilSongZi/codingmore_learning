package top.codingmore.codingmoremybatis.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/18 10:49
 * @description here is a description of this file.
 */
@Data
@Builder
public class User {

    private Integer id;
    private Integer age;
    private String name;
    private String password;

    @Tolerate
    User() {};
}
