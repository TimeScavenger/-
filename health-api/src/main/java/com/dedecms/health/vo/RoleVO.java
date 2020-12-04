package com.dedecms.health.vo;


import com.dedecms.health.pojo.Permission;
import com.dedecms.health.pojo.Role;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class RoleVO extends Role {

    private Set<Permission> permissionSet = new HashSet<Permission>(0);//对应权限集合
    private List<MenuVO> menuVOList = new ArrayList<>();
}
