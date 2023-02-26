package com.gapdoli.web.controller

import com.gapdoli.web.service.GoodsService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono

@Controller
class Goods(
  private val goodsService: GoodsService
) {

  // TODO : 상품리스트
  // TODO : view page 에 필요한 dto 생성 및 로직 개발 필요
  @GetMapping("/goods/goods-list")
  fun goodsList(model: Model): Mono<String> {
    model.addAttribute("goodsList", goodsService.findAll())
    return Mono.just("goods/goods-list")
  }

  // TODO : 상품상세

}