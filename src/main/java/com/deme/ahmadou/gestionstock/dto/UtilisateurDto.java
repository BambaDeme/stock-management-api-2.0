package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Adresse;
import com.deme.ahmadou.gestionstock.model.Entreprise;
import com.deme.ahmadou.gestionstock.model.Roles;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Builder
@Data
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private String motDePasse;

    private Instant dateDeNaissance;

    @Embedded
    private Adresse adresse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;

}
