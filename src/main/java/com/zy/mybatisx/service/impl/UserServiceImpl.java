package com.zy.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.mybatisx.pojo.User;
import com.zy.mybatisx.service.UserService;
import com.zy.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 2277352725
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2023-05-13 18:50:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




