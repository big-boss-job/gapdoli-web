package com.gapdoli.web.service

import com.gapdoli.web.domain.repository.GoodsRepository
import com.gapdoli.web.dto.goods.GoodsListResponse
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class GoodsService(
  private val goodsRepository: GoodsRepository
) {

  fun findAll(): Flux<GoodsListResponse> {
    return goodsRepository.findByIsDeleted(isDeleted = 1)
      .map { goods -> GoodsListResponse.of(goods) }
  }
}