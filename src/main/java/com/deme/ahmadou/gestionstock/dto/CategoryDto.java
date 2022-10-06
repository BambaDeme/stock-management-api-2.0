package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Article;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class CategoryDto {

    private String code;

    private String designation;

    private List<Article> articles;
}
