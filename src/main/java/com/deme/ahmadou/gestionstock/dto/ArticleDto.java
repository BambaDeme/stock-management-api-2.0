package com.deme.ahmadou.gestionstock.dto;


import com.deme.ahmadou.gestionstock.model.Article;
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

    public static ArticleDto fromEntity(Article article){
        if(article == null){
            // TODO threw exception
            return null;
        }

        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .category(CategoryDto.fromEntity(article.getCategory()))
                .build();

    }

    public static Article toEntity(ArticleDto articleDto){
        if(articleDto == null){
            // TODO threw new exception
            return null;
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setPhoto(articleDto.getPhoto());

        article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));

        return article;
    }
}
