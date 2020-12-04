package com.dedecms.health.vo;


import com.dedecms.health.pojo.CheckGroup;
import com.dedecms.health.pojo.CheckItem;
import lombok.Data;

import java.util.List;

@Data
public class CheckGroupVO extends CheckGroup {

    private List<CheckItem> checkItemList;

}
