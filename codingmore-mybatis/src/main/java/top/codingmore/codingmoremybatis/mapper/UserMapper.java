package top.codingmore.codingmoremybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.codingmore.codingmoremybatis.entity.User;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/18 10:57
 * @description here is a description of this file.
 */
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    User getOne(Integer id);

    @Insert("INSERT INTO user(name,password,age) VALUES(#{name}, #{password}, #{age})")
    void insert(User user);

    @Update("UPDATE user SET name=#{name},password=#{password},age=#{age} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Integer id);
}
