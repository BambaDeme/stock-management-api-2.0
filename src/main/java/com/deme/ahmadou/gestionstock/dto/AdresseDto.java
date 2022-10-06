package com.deme.ahmadou.gestionstock.dto;

import com.deme.ahmadou.gestionstock.model.Adresse;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class AdresseDto {
    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostal;

    private String pays;

    public AdresseDto fromEntity(Adresse adresse){
        if(adresse == null){
            // TODO throw exception
            return null;
        }
        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .ville(adresse.getVille())
                .codePostal(adresse.getCodePostal())
                .pays(adresse.getPays())
                .build();

    }

    public Adresse toEntitty(AdresseDto adresseDto){
        if(adresseDto == null){
            // TODO throw new exception
            return null;
        }

        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setCodePostal(adresseDto.getCodePostal());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());
        return adresse;
    }
}
