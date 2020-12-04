package com.dedecms.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dedecms.health.dto.CheckGroupDTO;
import com.dedecms.health.entity.PageResult;
import com.dedecms.health.entity.QueryPageBean;
import com.dedecms.health.pojo.CheckGroup;
import com.dedecms.health.pojo.CheckItem;

import java.util.List;
import java.util.Map;

public interface CheckGroupService extends IService<CheckGroup> {

    void saveCheckGroup(CheckGroupDTO checkGroupDTO);

    PageResult findPage(QueryPageBean queryPageBean);

    Map findCheckItemInfoByGroupId(int id);

    List<CheckItem> findCheckItemByGid(Integer id);
}
