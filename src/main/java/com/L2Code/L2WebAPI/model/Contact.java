package com.L2Code.L2WebAPI.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "contato", schema = "l2test")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contato_id")
    private Long id;

    @Column(name = "contato_nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "contato_email", length = 255, unique = true)
    private String email;

    @Column(name = "contato_celular", length = 11, unique = true, nullable = false)
    private String celular;

    @Column(name = "contato_telefone", length = 10)
    private String telefone;

    @Column(name = "contato_sn_favorito", columnDefinition = "CHAR(1) DEFAULT 'N'")
    private char favorito = 'N';

    @Column(name = "contato_sn_ativo", columnDefinition = "CHAR(1) DEFAULT 'S'")
    private char ativo = 'S';

    @Column(name = "contato_dh_cad")
    private LocalDateTime dataCadastro = LocalDateTime.now();
}
