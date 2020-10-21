package com.shenzhouyh.ad.service;

import com.imooc.ad.exception.AdException;
import com.shenzhouyh.ad.entity.AdPlan;
import com.shenzhouyh.ad.vo.AdPlanGetRequest;
import com.shenzhouyh.ad.vo.AdPlanRequest;
import com.shenzhouyh.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * Created by Qinyi.
 */
public interface IAdPlanService {

    /**
     * <h2>创建推广计划</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
