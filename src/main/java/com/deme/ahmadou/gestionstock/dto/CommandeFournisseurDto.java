package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Fournisseur;
import com.deme.ahmadou.gestionstock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {
    private Integer id;

    private String code;

    private Instant dateComaande;

    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurList;
}
