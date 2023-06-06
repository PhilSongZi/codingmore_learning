package top.codingmore.codingmorejpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/18 17:15
 * @description 实体类 User.
 */
@Data
@Entity
@Table(name = "user")
public class User {
    /**
     * @Data 注解为 lombok 注解，会自动为该类添加 getter/setter 方法。
     * @Entity 和 @Table 注解都是 JDK 1.5 以后引入的元数据注解，遵循 JPA 规范中定义的查询语言 JPQL，类似 SQL 语法，适用于 Java 类。
     * @Entity 表明该类是一个实体类，默认使用 ORM 规则，即类名为数据库表名，类中的字段名为数据库表中的字段名。
     * @Table 注解是非必选项，它的优先级高于 @Entity 注解，比如说 @Entity(name="user") 和 @Table(name="users") 同时存在的话，对应的表名为 users。
     * @Id 表名该字段为主键字段，当声明了 @Entity 注解，@Id 就必须也得声明。
     */
    @Id
    private Integer id;
    private Integer age;
    private String name;
    private String password;
}
