package com.deme.ahmadou.gestionstock.dto;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class AdresseDto {
    private String Adresse1;

    private String Adresse2;

    private String ville;

    private String codePostal;

    private String pays;
}
