package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Vente;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {
    private Integer id;

    private VentesDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

}
