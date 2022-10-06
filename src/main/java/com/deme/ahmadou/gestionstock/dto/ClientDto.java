package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Adresse;

import lombok.Builder;
import lombok.Data;
import javax.persistence.Embedded;
import java.util.List;

@Builder
@Data
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    // private Adresse adresse
    @Embedded
    private Adresse adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeClientDto> commandeClientList;
}
