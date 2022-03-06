package com.charles.shop.admin.modular.product.domain.dto;

import com.charles.shop.common.domain.jpa.Query;
import lombok.Data;

@Data
public class CategoryQuery {

    @Query(type= Query.Type.INNER_LIKE)
    private String name;

    @Query
    private Integer level;

    @Query(type= Query.Type.INNER_LIKE)
    private String keywords;

    @Query
    private Integer navStatus;
}
