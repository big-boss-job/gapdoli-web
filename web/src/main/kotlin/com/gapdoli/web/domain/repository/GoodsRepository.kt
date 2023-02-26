package com.gapdoli.web.domain.repository

import com.gapdoli.web.domain.entity.goods.Goods
import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Flux

interface GoodsRepository : R2dbcRepository<Goods, Long> {

  fun findByIsDeleted(isDeleted: Int): Flux<Goods>
}