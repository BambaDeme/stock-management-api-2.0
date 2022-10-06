package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Adresse;
import com.deme.ahmadou.gestionstock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    @Embedded
    private Adresse adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    private List<UtilisateurDto> utilisateurList;
}
