package com.dedecms.health.vo;


import com.dedecms.health.pojo.User;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class UserVO extends User {

    private Set<RoleVO> roles = new HashSet<RoleVO>(0);//对应角色集合

}
