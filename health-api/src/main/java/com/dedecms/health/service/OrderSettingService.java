package com.dedecms.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dedecms.health.pojo.OrderSetting;

import java.util.List;
import java.util.Map;

public interface OrderSettingService extends IService<OrderSetting> {
    void saveOrderSettingBatch(List<String[]> ordersettinglist);

    Map findSettingData(int year, int month);

    void updateNumberByOrderDate(String orderdate, int number);

    int isOrderOkByOrderDate(String orderDate);

    void updateReservationsByOrderDate(String orderDate);
}
