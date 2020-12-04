package com.dedecms.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dedecms.health.entity.PageResult;
import com.dedecms.health.entity.QueryPageBean;
import com.dedecms.health.pojo.CheckItem;

public interface CheckItemService extends IService<CheckItem> {
    PageResult findPage(QueryPageBean queryPageBean);
}
