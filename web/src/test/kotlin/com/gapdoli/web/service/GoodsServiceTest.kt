package com.gapdoli.web.service

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("local")
@SpringBootTest
class GoodsServiceTest @Autowired constructor(
  private val goodsService: GoodsService
) {

  @Test
  fun findAll() {
    //given

    //when
    val count = goodsService.findAll().count().block()

    //then
    assertTrue((count!! > 0))
  }
}
