package com.dedecms.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dedecms.health.pojo.Order;

import java.util.Map;

public interface OrderService extends IService<Order> {
    Order add(Map map);

    Map findOrderDetailByOrderId(int id);
}
