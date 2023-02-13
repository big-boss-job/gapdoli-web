package com.gapdoli.web.domain

import org.springframework.data.annotation.Id
import java.time.LocalDateTime

class Goods(

  @Id
  val id: Long ?= null,

  val goodsKindId: Long,

  val goodsCode: String,

  val name: String,

  val providerKind: String,

  val providerCode: String,

  val providerName: String,

  val supplyPrice: Int = 0,

  val stock: Int = 0,

  val boxDetailCount: Int = 0,

  val minPackageCount: Int = 0,

  val stockNoticeCount: Int = 0,

  val stockNoticeState: StockNoticeState = StockNoticeState.N,

  val isDeleted: DeleteStatus = DeleteStatus.FALSE,

  val orderVal: Char,

  val updateDate: LocalDateTime,

  val createdDate: LocalDateTime,
)