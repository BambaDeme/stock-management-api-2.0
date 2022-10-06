package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Article;
import com.deme.ahmadou.gestionstock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStockDto {
    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvtStk;
}
