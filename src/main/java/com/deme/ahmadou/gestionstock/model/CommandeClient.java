package com.deme.ahmadou.gestionstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "commandeClient")
public class CommandeClient extends AbstractEntity{
}
