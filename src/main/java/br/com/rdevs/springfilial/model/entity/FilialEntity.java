package br.com.rdevs.springfilial.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TB_FILIAL")
@Data
public class FilialEntity {

    @Id
    @GeneratedValue
    @Column(name = "CD_FILIAL")
    private Integer cdFilial;

    @Column(name = "NM_FILIAL")
    private String nmFilial;

    @Column(name = "NR_CNPJ")
    private String nrCnpj;
}
