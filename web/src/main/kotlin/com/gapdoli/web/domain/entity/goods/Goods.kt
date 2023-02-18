package com.gapdoli.web.domain.entity.goods

import com.gapdoli.web.domain.entity.goods.enums.StockNoticeState
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table(name = "goods")
class Goods(

  @Id
  val id: Long ?= null,

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

  val stockNoticeCount: Int = 0,

  val stockNoticeState: StockNoticeState = StockNoticeState.N,

  // TODO : ENUM 으로 변경 필요
//  val isDeleted: DeleteStatus = DeleteStatus.FALSE,
  val isDeleted: Int,

  val orderVal: Int?,

  val updateDate: LocalDateTime,

  val createdDate: LocalDateTime,
)