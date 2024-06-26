package br.com.fiap.challenge.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TB_LOGIN")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_LOGIN")
    @SequenceGenerator(name = "SQ_LOGIN", sequenceName = "SQ_LOGIN", allocationSize = 1)
    @Column(name = "ID_LOGIN")
    private Long id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SENHA")
    private String senha;

    @Transient
    private String repetirSenha;

    @Transient
    private String repetirEmail;

}
