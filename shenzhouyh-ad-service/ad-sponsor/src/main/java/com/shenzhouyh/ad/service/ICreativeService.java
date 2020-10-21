package com.shenzhouyh.ad.service;

import com.shenzhouyh.ad.vo.CreativeRequest;
import com.shenzhouyh.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
