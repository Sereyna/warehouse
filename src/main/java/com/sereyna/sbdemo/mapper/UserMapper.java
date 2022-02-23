package com.sereyna.sbdemo.mapper;

import com.sereyna.sbdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    // 注册用户
    /* why int
    xml方式
    sqlSession调用update， insert， delete返回的也是int值， 这个int表示增删改操作影响的记录行数。
    注解方式也是同理：
    加上@Insert @Update @Delete注解的方法也有相应的int返回值，表示增删改操作影响的记录行数， 不加也不会影响运行。
     */
    @Insert("insert into user values(null, #{name}, #{pwd})")
    int add(User user);

    // 获取用户
    @Select("select * from user where username=#{name}")
    User getByname(User user);

    // 更新用户密码
    @Update("update user set pwd=#{pwd} where username=#{name}")
    int update(User user);
}
