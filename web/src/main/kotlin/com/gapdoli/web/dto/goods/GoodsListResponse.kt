package com.gapdoli.web.dto.goods

import com.gapdoli.web.domain.entity.goods.Goods

class GoodsListResponse(
  val id: Long,

  val goodsKindId: Long,

  val goodsCode: String,

  val name: String,

  val providerKind: String?,

  val providerCode: String?,

  val providerName: String?,

  val supplyPrice: Int = 0,

  val stock: Int = 0,

  val boxDetailCount: Int = 0,

  val minPackageCount: Int = 0,

) {

  companion object {
    fun of(goods: Goods): GoodsListResponse {
      return GoodsListResponse(
        id = goods.id!!,
        goodsKindId = goods.goodsKindId,
        goodsCode = goods.goodsCode,
        name = goods.name,
        providerKind = goods.providerKind,
        providerCode = goods.providerCode,
        providerName = goods.providerName,
        supplyPrice = goods.supplyPrice,
        stock = goods.stock,
        boxDetailCount = goods.boxDetailCount,
        minPackageCount = goods.minPackageCount
      )
    }
  }
}

