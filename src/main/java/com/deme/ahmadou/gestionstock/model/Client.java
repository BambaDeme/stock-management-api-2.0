package com.deme.ahmadou.gestionstock.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "client")
@EqualsAndHashCode(callSuper = true)
public class Client extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    // private Adresse adresse
    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numtel")
    private String numTel;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClientList;
}
