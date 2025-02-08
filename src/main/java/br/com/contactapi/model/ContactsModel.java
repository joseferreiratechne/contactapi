package br.com.contactapi.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "desafio.coontato")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contato_id")
    private UUID id;

    @Column(name = "contato_nome", length = 100)
    private String name;

    @Column(name = "contato_email")
    private String email;

    @Column(name = "contato_celular", length = 11)
    private String phoneNumber;

    @Column(name = "contato_sn_favorito", length = 1)
    private String favoriteContact;

    @Column(name = "contato_sn_ativo", length = 1)
    private String activeContact;

    @CreationTimestamp
    @Column(name = "contato_dh_cad")
    private LocalDateTime contactDhCad;
}
