package cn.clboy.springbootjpa.repository;

import cn.clboy.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承JpaRepository来完成对数据库的操作
 * 泛型是（实体类，主键）
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}