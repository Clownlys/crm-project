package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Goods;
import com.shangma.cn.service.GoodsService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<Goods,Long> implements GoodsService {
}
