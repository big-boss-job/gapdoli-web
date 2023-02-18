package com.gapdoli.web.domain.repository

import com.gapdoli.web.domain.entity.goods.Goods
import com.gapdoli.web.domain.repository.GoodsRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import reactor.core.publisher.Flux

@ActiveProfiles("local")
@SpringBootTest
class GoodsRepositoryTest @Autowired constructor(
  private val goodsRepository: GoodsRepository
) {

  @Test
  fun findAll() {

    //given

    //when
    val goods: Flux<Goods> = goodsRepository.findAll()

    //then
    println(goods.count().block())
  }
}