package com.dedecms.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dedecms.health.dto.SetmealDTO;
import com.dedecms.health.entity.PageResult;
import com.dedecms.health.entity.QueryPageBean;
import com.dedecms.health.vo.SetmealVO;
import com.dedecms.health.pojo.Setmeal;

public interface SetmealService extends IService<Setmeal> {
    void saveSetemal(SetmealDTO setmealDTO);

    PageResult findPage(QueryPageBean queryPageBean);

    SetmealVO findSetMealDetail(int id);
}
