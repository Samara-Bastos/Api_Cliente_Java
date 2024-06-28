package form.cliente.dto;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestDTO(

    @NotBlank
    String nome,

    @NotNull
    LocalDate nascimento,

    @NotBlank
    String email,

    @NotBlank
    String telefone,

    @NotBlank
    String escolaridade,

    @NotBlank
    String estCivil,

    @NotNull
    Boolean filhos,

    @NotBlank
    String descricao
){}
