package com.shangma.cn.service.impl;

import com.shangma.cn.entity.OutStore;
import com.shangma.cn.service.OutStoreService;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:Mei
 * @create:2021-01-06 19:46
 */
@Service
@Transactional
public class OutStoreServiceImpl extends BaseServiceImpl<OutStore,Long> implements OutStoreService {
}
