package com.deme.ahmadou.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {
    private Integer id;

    private String code;

    private String designation;

    private List<ArticleDto> articles;
}
