package com.dedecms.health.vo;


import com.dedecms.health.pojo.Setmeal;
import lombok.Data;

import java.util.List;

@Data
public class SetmealVO extends Setmeal {

    private List<CheckGroupVO> checkGroups;

}
