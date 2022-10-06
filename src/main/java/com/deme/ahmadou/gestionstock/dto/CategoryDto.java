package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {
    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category){
        if(category == null){
            // TODO threw  exception
            return null;
        }else {
            return CategoryDto.builder()
                    .id(category.getId())
                    .code(category.getCode())
                    .designation(category.getDesignation())
                    .build();
        }
    }

    public Category fromEntity(CategoryDto categoryDto){
        if(categoryDto ==null){
            // TODO throw exception
            return null;
        }else{
            return Category.builder()
                    .id(categoryDto.getId())
                    .code(categoryDto.getCode())
                    .designation(categoryDto.getDesignation())
                    .build();

        }
    }
}
