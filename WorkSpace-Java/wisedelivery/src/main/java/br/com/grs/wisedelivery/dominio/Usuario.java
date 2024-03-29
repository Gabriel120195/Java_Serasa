package br.com.grs.wisedelivery.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class Usuario {
    
    @EqualsAndHashCode.Include
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Getter @Setter
    @Column(length = 80,nullable = false)
    private String nome;


    @Getter @Setter
    @Column(length = 60,nullable = false)
    private String email;


    @Getter @Setter
    @Column(length = 80,nullable = false)
    private String senha;

    @Getter @Setter
    @Column(length = 20,nullable = false)
    private String telefone;
}