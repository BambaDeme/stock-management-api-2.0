package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Article;
import com.deme.ahmadou.gestionstock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseur;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
