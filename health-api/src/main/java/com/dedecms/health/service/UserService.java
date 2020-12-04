package com.dedecms.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dedecms.health.vo.UserVO;
import com.dedecms.health.pojo.User;

public interface UserService extends IService<User> {
    UserVO findUserInfoByUsername(String username);
}
