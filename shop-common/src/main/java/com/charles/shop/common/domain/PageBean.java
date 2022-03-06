package com.charles.shop.common.domain;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class PageBean<T> {

    private Integer currentPage;

    private Long total;

    private Integer pages;

    private Integer pageSize;

    private List<T> content;

    public static <T> PageBean<T> restPage(Page<T> pageInfo) {
        PageBean<T> result = new PageBean<>();
        result.setPages(pageInfo.getTotalPages());
        result.setCurrentPage(pageInfo.getNumber() + 1);
        result.setTotal(pageInfo.getTotalElements());
        result.setContent(pageInfo.getContent());
        result.setPageSize(pageInfo.getSize());
        return result;
    }
}
