package com.gapdoli.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Goods {

  @GetMapping("/goods/goods-list")
  fun goodsList(): String {
    return "goods/goods-list"
  }
}