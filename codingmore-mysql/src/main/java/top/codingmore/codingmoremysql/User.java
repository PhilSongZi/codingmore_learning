package top.codingmore.codingmoremysql;

import lombok.Data;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/18 16:29
 * @description here is a description of this file.
 */
@Data
public class User {

    private Integer id;
    private String name;
    private String password;
    private Integer age;
}

