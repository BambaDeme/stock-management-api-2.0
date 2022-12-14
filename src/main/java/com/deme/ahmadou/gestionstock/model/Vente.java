package com.deme.ahmadou.gestionstock.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vente")
public class Vente extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "datevente")
    private Instant dateVente;


    @Column(name = "commentaire")
    private String commentaire;
}
