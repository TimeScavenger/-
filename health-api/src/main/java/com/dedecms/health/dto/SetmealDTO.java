package com.dedecms.health.dto;

import com.dedecms.health.pojo.Setmeal;
import lombok.Data;

import java.io.Serializable;

@Data
public class SetmealDTO extends Setmeal implements Serializable {

    private Integer[] checkgroupIds;

}
