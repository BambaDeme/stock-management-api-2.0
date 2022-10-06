package com.deme.ahmadou.gestionstock.dto;


import com.deme.ahmadou.gestionstock.model.Category;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private CategoryDto category;
}
