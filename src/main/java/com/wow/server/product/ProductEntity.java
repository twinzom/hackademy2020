package com.wow.server.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_PRODUCT")
@Getter
@Setter
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productCode;
    private String productName;
    private BigDecimal marketCap;
    private BigDecimal avgVolume;
    private BigDecimal peRatio;
    private BigDecimal revenue;
    private BigDecimal totalCash;
    private BigDecimal totalDevidendYield;
    private BigDecimal avgDividendYield;
    private String sector;
    private String industry;
    private BigDecimal price;
    private BigDecimal priceOneDayChange;
    private LocalDateTime creationDateTime;
    private LocalDateTime updateDateTime;
}
