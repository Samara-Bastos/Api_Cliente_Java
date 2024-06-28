package form.cliente.entity;

import java.time.LocalDate;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private LocalDate nascimento;

    @Column(unique = true)
    private String email;

    @Column
    private String telefone;

    @Column
    private String escolaridade;

    @Column
    private String estCivil;

    @Column
    private Boolean filhos;

    @Column
    private String descricao;
}
