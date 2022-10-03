package com.deme.ahmadou.gestionstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "commandeClient")
@EqualsAndHashCode(callSuper = true)
public class CommandeClient extends AbstractEntity{
}
