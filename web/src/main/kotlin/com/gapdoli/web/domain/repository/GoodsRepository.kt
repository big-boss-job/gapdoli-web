package com.gapdoli.web.domain.repository

import com.gapdoli.web.domain.entity.goods.Goods
import org.springframework.data.r2dbc.repository.R2dbcRepository

interface GoodsRepository : R2dbcRepository<Goods, Long>