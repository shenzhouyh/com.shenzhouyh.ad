package com.shenzhouyh.ad.service;

import com.imooc.ad.exception.AdException;
import com.shenzhouyh.ad.vo.CreateUserRequest;
import com.shenzhouyh.ad.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
