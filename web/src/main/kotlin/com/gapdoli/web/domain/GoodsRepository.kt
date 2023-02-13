package com.gapdoli.web.domain

import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface GoodsRepository : ReactiveCrudRepository<Goods, Long> {
}