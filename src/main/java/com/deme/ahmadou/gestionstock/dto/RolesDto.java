package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Builder
@Data
public class RolesDto {
    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;
}
