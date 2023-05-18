package top.codingmore.codingmoremybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.codingmore.codingmoremybatis.entity.User;
import top.codingmore.codingmoremybatis.mapper.UserMapper;

import java.util.List;

@SpringBootTest
@Slf4j
class CodingmoreMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        userMapper.insert(User.builder().age(18).name("沉默王二").password("123456").build());
        userMapper.insert(User.builder().age(18).name("沉默王三").password("123456").build());
        userMapper.insert(User.builder().age(18).name("沉默王四").password("123456").build());
        log.info("查询所有：{}",userMapper.getAll().stream().toArray());
    }

    @Test
    List<User> testQuery() {
        List<User> all = userMapper.getAll();
        log.info("查询所有：{}",all.stream().toArray());
        return all;
    }

    @Test
    void testUpdate() {
        User one = userMapper.getOne(1);
        log.info("更新前{}", one);
        one.setPassword("654321");
        userMapper.update(one);
        log.info("更新后{}", userMapper.getOne(1));
    }

    @Test
    void testDelete() {
        log.info("删除前{}", userMapper.getAll().toArray());
        userMapper.delete(1);
        log.info("删除后{}", userMapper.getAll().toArray());

    }
}
