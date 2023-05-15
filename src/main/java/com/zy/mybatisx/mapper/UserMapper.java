package com.zy.mybatisx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zy.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 2277352725
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2023-05-13 18:50:43
* @Entity com.zy.mybatisx.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    int deleteByUidAndName(@Param("uid") Long uid, @Param("name") String name);

    int updateAgeAndNameByUid(@Param("age") Integer age, @Param("name") String name, @Param("uid") Long uid);

}




