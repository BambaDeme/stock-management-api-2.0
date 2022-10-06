package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Article;
import com.deme.ahmadou.gestionstock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeClientDto {

    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
