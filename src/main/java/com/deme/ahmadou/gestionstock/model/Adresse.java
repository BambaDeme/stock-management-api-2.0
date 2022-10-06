package com.deme.ahmadou.gestionstock.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Embeddable
public class Adresse {

    @Column(name = "adresse1")
    private String Adresse1;

    @Column(name = "adresse2")
    private String Adresse2;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codepostal")
    private String codePostal;

    @Column(name = "pays")
    private String pays;
}
